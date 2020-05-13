package com.sg.addressbook;

import controller.AddressBookController;
import dao.AddressBookDao;
import dao.AddressBookDaoFileImpl;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args){
        UserIO myIO = new UserIOConsoleImpl();
        AddressBookView myView = new AddressBookView(myIO);
        AddressBookDao myDao = new AddressBookDaoFileImpl();
        AddressBookController controller = new AddressBookController(myDao, myView);
        controller.run();
    }
}
