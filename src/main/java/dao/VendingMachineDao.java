package dao;

import dto.Item;

import java.util.List;

public interface VendingMachineDao {

    Item addItem(String name, Item item) throws VendingMachinePersistenceException;
    List<Item> getAllItems() throws VendingMachinePersistenceException;
    Item getItem(String name) throws VendingMachinePersistenceException;
    void removeItem(String name) throws VendingMachinePersistenceException;
    void removeItemCount(String name) throws VendingMachinePersistenceException;
    int countItem(String name) throws VendingMachinePersistenceException;




}
