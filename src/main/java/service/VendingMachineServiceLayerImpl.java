package service;

import dao.VendingMachineDao;
import dao.VendingMachineDaoFileImpl;
import dao.VendingMachinePersistenceException;
import dto.Change;
import dto.Item;

import java.util.List;

public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    VendingMachineDao dao;

    public VendingMachineServiceLayerImpl(VendingMachineDao dao) {

        this.dao = dao;
    }

    @Override
    public void addItem(String name, Item item) throws VendingMachinePersistenceException {
        dao.addItem(item.getName(), item);
    }

    @Override
    public List<Item> getAllItems() throws VendingMachinePersistenceException {
        return dao.getAllItems();
    }

    @Override
    public Item getItem(String name) throws VendingMachinePersistenceException {
        return dao.getItem(name);
    }

    @Override
    public void removeItem(String name) throws VendingMachinePersistenceException {

    }

    @Override
    public void removeItemCount(String name) throws VendingMachinePersistenceException {

    }

    @Override
    public double makePurchase(double moneyEntered, int getMenuSelection) throws NullItemException, NoItemInventoryException, InsufficientFundsException, VendingMachinePersistenceException {
        List<Item> vendingItems = dao.getAllItems();
        double moneyOwed = 0;
        Item purchaseItem = vendingItems.get(getMenuSelection);
//        boolean nullItem = false;
//        while(nullItem) {
            if (dao.getItem(purchaseItem.getName()) == null) {
                throw new NullItemException("ERROR: Could not find item. Item " + purchaseItem.getName() + " is not available for purchase. Please enter select a valid item.");
            } else {
//                nullItem =false;
                if (purchaseItem.getInventoryCount() <= 0){
                    throw new NoItemInventoryException("ERROR: The item you selected is not in stock");
            }
                if(moneyEntered < purchaseItem.getCost()){
                    throw new InsufficientFundsException("ERROR: Insufficient funds. You entered $" + moneyEntered);
                }else{
                    moneyOwed = moneyEntered - purchaseItem.getCost();
                }
        }
        return moneyOwed;
    }

    @Override
    public Change calculateChange(double moneyEntered) {
        Change changeOwed = new Change();
        Item purchaseItem = new Item();
        double pennyCount = moneyEntered*100;
        double itemCost = purchaseItem.getCost();
        double moneyOwed = pennyCount - itemCost;
        changeOwed.getQuarters()
        return changeOwed;
    }



}
