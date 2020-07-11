package com.sg.vendingmachine;

import controller.VendingMachineController;
import dao.VendingMachineDao;
import dao.VendingMachineDaoFileImpl;
import service.VendingMachineServiceLayer;
import service.VendingMachineServiceLayerImpl;
import ui.UserIO;
import ui.UserIOConsoleImpl;
import ui.VendingMachineView;

public class AppPre {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        VendingMachineView myView = new VendingMachineView(myIo);
        VendingMachineDao myDao = new VendingMachineDaoFileImpl();
        VendingMachineServiceLayer myService = new VendingMachineServiceLayerImpl(myDao);
        VendingMachineController controller = new VendingMachineController(myService, myDao, myView);
        controller.inventoryPopulate();
    }
}
