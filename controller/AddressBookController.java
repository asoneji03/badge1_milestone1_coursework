package controller;

import dao.AddressBookDao;
import dao.AddressBookDaoException;
import dao.AddressBookDaoFileImpl;
import dto.Address;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import java.util.List;

public class AddressBookController {
    
    AddressBookView view;
    AddressBookDao dao;

    public AddressBookController(AddressBookDao dao, AddressBookView view){
        this.dao = dao;
        this.view = view;
    }


    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        createAddress();
                        break;
                    case 2:
                        removeAddress();
                        break;
                    case 3:
                        viewAddress();
                        break;
                    case 4:
                        countAddresses();
                        break;
                    case 5:
                        listAddresses();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (AddressBookDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createAddress() throws AddressBookDaoException {
        view.displayCreateAddressBanner();
        Address newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayCreateSuccessBanner();
    }

    private void removeAddress()throws AddressBookDaoException{
        view.displayRemoveAddressBanner();
        String lastName = view.getLastNameChoice();
        dao.removeAddress(lastName);
        view.displayRemoveSuccessBanner();
    }

    private void countAddresses() throws AddressBookDaoException{
        view.displayCountAddressBanner();
        dao.countTotalAddress();
        List<Address> addressList = dao.getAllAddresses();
        view.displayCountAddress(addressList);
    }

    private void listAddresses() throws AddressBookDaoException {
        view.displayDisplayAllBanner();
        List<Address> addressList = dao.getAllAddresses();
        view.displayAddressList(addressList);
    }

    private void viewAddress() throws AddressBookDaoException{
        view.displayDisplayAddressBanner();
        String lastName = view.getLastNameChoice();
        Address address = dao.getAddress(lastName);
        view.displayAddress(address);
    }

    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }

    private void exitMessage(){
        view.displayExitBanner();
    }


}
