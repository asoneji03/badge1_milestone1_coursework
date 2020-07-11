package service;

import dao.VendingMachinePersistenceException;
import dto.Change;
import dto.Item;

import java.util.List;

public interface VendingMachineServiceLayer {
    void addItem(String name, Item item) throws VendingMachinePersistenceException, NullItemException;
    List<Item> getAllItems() throws VendingMachinePersistenceException;
    Item getItem(String name) throws VendingMachinePersistenceException;
    void removeItem(String name) throws VendingMachinePersistenceException;
    void removeItemCount(String name) throws VendingMachinePersistenceException;

    double makePurchase(double moneyEntered, int getMenuSelection) throws NullItemException, NoItemInventoryException, InsufficientFundsException, VendingMachinePersistenceException;
    Change calculateChange(double moneyEntered);


}
