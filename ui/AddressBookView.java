package ui;

import dto.Address;

import java.util.List;

public class AddressBookView {

    UserIO io;

    public AddressBookView(UserIO io){
        this.io = io;
    }

    public int printMenuAndGetSelection(){
        io.print("Main Menu");
        io.print("1. Add an Address");
        io.print("2. Remove an Address");
        io.print("3. Find an Address by last name");
        io.print("4. Return a count of Addresses");
        io.print("5. Return all of the Addresses");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1,6);

    }

    public Address getNewAddressInfo(){
        String firstName = io.readString("Please Enter First Name:");
        String lastName = io.readString("Please Enter Last Name:");
        String streetAddress = io.readString("Please Enter Street Address");
        Address currentAddress = new Address();
        currentAddress.setFirstName(firstName);
        currentAddress.setLastName(lastName);
        currentAddress.setStreetAddress(streetAddress);
        return currentAddress;
    }

    public void displayCreateAddressBanner(){
        io.print("===Add Address Menu===");
    }

    public void displayCreateSuccessBanner(){
        io.readString("Address Added. Press 1 to go to main menu.");
    }

    public void displayAddressList(List<Address> addressList){
        for(Address currentAddress : addressList){
            io.print(currentAddress.getFirstName() + " " + currentAddress.getLastName() + " " + currentAddress.getStreetAddress());
        }
        io.readString("Press 1 to go to Main Menu.");
    }

    public void displayDisplayAllBanner(){
        io.print("===List All Addresses===");
    }

    public void displayDisplayAddressBanner(){
        io.print("===Find Address Menu===");
    }

    public String getLastNameChoice(){
        return io.readString("Please enter the Last Name.");
    }

    public void displayAddress(Address address){
        if(address != null){
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreetAddress());
            io.print("");
        }else{
            io.print("No such address.");
        }
        io.readString("Press 1 to continue.");
    }

    public void displayCountAddressBanner(){
        io.print("===List Address Count Menu===");
    }

    public void displayCountAddress(List<Address> addressList){
            int count = 0;
            for(Address currentAddress : addressList){
                count++;
            }
            io.readString("There are " + count + " addresses in the book. Press 1 to go to Main Menu.");
        }

    public void displayRemoveAddressBanner(){
        io.print("===Delete Address===");
    }

    public void displayRemoveSuccessBanner(){
        io.readString("Address successfully removed. Press 1 to return to Main Menu.");
    }

    public void displayExitBanner(){
        io.print("Good Bye");
    }

    public void displayUnknownCommandBanner(){
        io.print("Unknown Command");
    }

    public void displayErrorMessage(String errorMsg){
        io.print("===ERROR===");
        io.print(errorMsg);
    }



}
