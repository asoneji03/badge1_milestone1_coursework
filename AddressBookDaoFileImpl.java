package dao;

import dto.Address;

import java.io.*;
import java.util.*;

public class AddressBookDaoFileImpl implements AddressBookDao{

    public static final String BOOK_FILE = "book.txt";
    public static final String DELIMITER  = "::";
    private void loadBook() throws AddressBookDaoException{
        Scanner scanner;
        try{
            scanner = new Scanner(new BufferedReader((new FileReader(BOOK_FILE))));
        } catch (FileNotFoundException e) {
           throw new AddressBookDaoException("-_- could not load address book data into memory.", e);
        }
        String currentLine;
        String[] currentTokens;
        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Address currentAddress = new Address();
            currentAddress.setFirstName(currentTokens[0]);
            currentAddress.setLastName(currentTokens[1]);
            currentAddress.setStreetAddress(currentTokens[2]);

            addresses.put(currentAddress.getLastName(), currentAddress);
        }
        scanner.close();
    }

    private void writeBook() throws AddressBookDaoException{
        PrintWriter out;
        try{
            out = new PrintWriter(new FileWriter(BOOK_FILE));

        } catch (IOException e) {
            throw new AddressBookDaoException("Could not save address data.", e);
        }
        List<Address> addressList = this.getAllAddresses();
        for(Address currentAddress : addressList){
            out.println(currentAddress.getFirstName()+ DELIMITER + currentAddress.getLastName() + DELIMITER + currentAddress.getStreetAddress());
            out.flush();
        }
        out.close();
    }

    @Override
    public Address addAddress(String lastName, Address address)
        throws AddressBookDaoException{
        Address newAddress = addresses.put(lastName, address);
        writeBook();
        return newAddress;
    }

    @Override
    public Address editAddress(String lastName){
        return addresses.get(lastName).setStreetAddress(String);
    }

    @Override
    public Address removeAddress(String lastName)
        throws AddressBookDaoException{
        Address removedAddress = addresses.remove(lastName);
        writeBook();
        return removedAddress;
    }

    @Override
    public int countTotalAddress()
        throws AddressBookDaoException{
        int countAddresses = addresses.size();
        writeBook();
        return countAddresses;
    }

    @Override
    public List<Address> getAllAddresses()
        throws AddressBookDaoException{
        loadBook();
        return new ArrayList<Address>(addresses.values());
    }

    @Override
    public Address getAddress(String lastName)
        throws AddressBookDaoException{
        loadBook();
        return addresses.get(lastName);
    }

    private Map<String, Address> addresses = new HashMap<>();
}
