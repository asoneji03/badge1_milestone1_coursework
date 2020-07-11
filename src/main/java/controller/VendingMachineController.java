package controller;

import dao.VendingMachineDao;
import dao.VendingMachinePersistenceException;
import dto.Item;
import service.InsufficientFundsException;
import service.NoItemInventoryException;
import service.NullItemException;
import service.VendingMachineServiceLayer;
import ui.VendingMachineView;

import java.util.List;

public class VendingMachineController {
    VendingMachineView view;
    VendingMachineDao dao;
    VendingMachineServiceLayer service;

    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineDao dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
        this.service = service;
    }

    public void run(){
        boolean keepGoing = true;
        while(keepGoing) {

            try {
                double moneyEntered = 0;
                int menuSelection = 0;
                double changeOwedFromPurchase = makePurchase( moneyEntered, menuSelection);
//                ItemAvailability(); //use service layer method to call to make the full purchase (*must call change object and must throw exception if fails) (including item avail and enough money amt)
//                userPurchase();

            } catch (VendingMachinePersistenceException | NullItemException | NoItemInventoryException | InsufficientFundsException e) {
                view.displayErrorMessage(e.getMessage());
            }
        }
    }
    private double userEntersMoney() throws VendingMachinePersistenceException {
        List<Item> vendingItems = dao.getAllItems();
        return view.getMoneyAmount(vendingItems);
    }

    private int getMenuSelection() throws VendingMachinePersistenceException {
        List<Item> vendingItems = dao.getAllItems();
        int getSelection = view.getItemSelection(vendingItems) -1;
        return getSelection;
    }


    private double makePurchase(double moneyGiven, int itemSelection) throws VendingMachinePersistenceException, InsufficientFundsException, NoItemInventoryException, NullItemException {
        List<Item> vendingItems = dao.getAllItems();
        moneyGiven = userEntersMoney();
        itemSelection = getMenuSelection();
        Item purchaseItem = vendingItems.get(itemSelection);
        double changeOwed = service.makePurchase(moneyGiven, itemSelection);
        view.displayChangeOwed(purchaseItem, moneyGiven);
        return changeOwed;
    }

//    private void ItemAvailability() throws VendingMachinePersistenceException {
//        List<Item> vendingItems = dao.getAllItems();
//        view.displayItemAvailability(vendingItems);
//    }

//    private void userPurchase()throws VendingMachinePersistenceException {
//        List<Item> vendingItems = dao.getAllItems();
//        view.displayPurchase(vendingItems);
//    }

//    public double changeRequired(double moneyGiven){
//        double moneyGivenInPennies = moneyGiven * 100;
//        double penniesOwed = 0;
//        double nicklesOwed = 0;
//        double dimesOwed = 0;
//        double quartersOwed = 0;
//
//
//        return penniesOwed + nicklesOwed + dimesOwed + quartersOwed;
//    }


    public void inventoryPopulate() {
        boolean keepGoingPre = true;
        int menuInventoryChoice = 0;
        try {
            while (keepGoingPre) {
                menuInventoryChoice = getInventoryMenuChoice();
                switch (menuInventoryChoice) {
                    case 1:
                        createItem();
                        break;
                    case 2:
                        listItems();
                        break;
                    case 3:
                        countItemFromInventory();
                        break;
                    case 4:
                        removeItemFromInventory();
                        break;
                    case 5:
                        keepGoingPre = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitInventoryMessage();
        }catch (VendingMachinePersistenceException e){
            view.displayErrorMessage(e.getMessage());
        }
    }
    private int getInventoryMenuChoice(){
        return view.printMenuPopulateInventory();
    }


    public void createItem() throws VendingMachinePersistenceException {
        view.displayCreateItemBanner();
        Item newItem = view.getNewItemInfo();
        dao.addItem(newItem.getName(), newItem);
        view.displayCreateSuccessBanner();
    }

    public void listItems() throws VendingMachinePersistenceException {
        view.displayDisplayAllBanner();
        List<Item> vendingList = dao.getAllItems();
        view.displayItemList(vendingList);

    }

    private String viewItem() throws VendingMachinePersistenceException {
        view.displayDisplayItemBanner();
        String name = view.getItemNameChoice();
        Item item = dao.getItem(name);
        view.displayItem(item);
        return name;

    }


    public int countItemFromInventory() throws VendingMachinePersistenceException {
        view.countInventoryBanner();
        String name = view.getItemNameChoice();
        Item item = dao.getItem(name);
        int countOfItem = dao.countItem(name);
        view.displayInventoryCountOfItem(item);
        return countOfItem;
    }

    public void removeItemFromInventory() throws VendingMachinePersistenceException {
        view.displayRemoveItemBanner();
        String name = view.getItemNameChoice();
        dao.removeItem(name);
        view.displayRemoveItemSuccessBanner();

    }

    private void unknownCommand(){

        view.displayUnknownCommandBanner();
    }

    private void exitMessage(){

        view.displayExitBanner();
    }

    private void exitInventoryMessage(){
        view.displayExitInventoryBanner();

    }


    }


