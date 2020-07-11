package dao;

import dto.Item;

import java.io.*;
import java.util.*;

public class VendingMachineDaoFileImpl implements VendingMachineDao{
    public static final String MACHINE_FILE = "machine.txt";
    public static final String DELIMITER = "::";

    public void loadMachine() throws VendingMachinePersistenceException {
        Scanner scanner;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(MACHINE_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingMachinePersistenceException("-_- Could not load vending machine data into memory,", e);
        }
        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Item currentItem = new Item();
            currentItem.setName(currentTokens[0]);
            currentItem.setCost(Double.parseDouble(currentTokens[1]));
            currentItem.setInventoryCount(Integer.parseInt(currentTokens[2]));

            vendingItems.put(currentItem.getName(), currentItem);
        }
        scanner.close();
    }

    private void writeMachine() throws VendingMachinePersistenceException {
        PrintWriter out;

        try{
            out = new PrintWriter(new FileWriter(MACHINE_FILE));
        }catch (IOException e){
            throw new VendingMachinePersistenceException("Could not save student data.", e);
        }

        List<Item> vendingItems = this.getAllItems();
        for(Item currentItem : vendingItems){
            out.println(currentItem.getName() + DELIMITER + currentItem.getCost() + DELIMITER + currentItem.getInventoryCount());
            out.flush();
        }
        out.close();
    }

    @Override
    public Item addItem(String name, Item item)
        throws VendingMachinePersistenceException {
        Item newItem = vendingItems.put(name, item);
        writeMachine();
        return newItem;
    }

    @Override
    public List<Item> getAllItems()
        throws VendingMachinePersistenceException {
        loadMachine();
        return new ArrayList<Item>(vendingItems.values());
    }

    @Override
    public Item getItem(String name)
        throws VendingMachinePersistenceException {
        loadMachine();
        return vendingItems.get(name);
    }

    @Override
    public void removeItem(String name)
        throws VendingMachinePersistenceException {
        Item removedItem = vendingItems.remove(name);
        writeMachine();

    }

    @Override
    public void removeItemCount(String name)
        throws VendingMachinePersistenceException {
        int newItemCountAfterPurchase = vendingItems.get(name).getInventoryCount()-1;
        vendingItems.get(name).setInventoryCount(newItemCountAfterPurchase);
        writeMachine();
    }

    @Override
    public int countItem(String name)
        throws VendingMachinePersistenceException {
        writeMachine();
        return vendingItems.get(name).getInventoryCount();
    }


    private Map<String, Item> vendingItems = new HashMap<>();

//    //read test file
//    public Map<String, Item> getAllItemsTest() throws IOException {
//        Gson gson = new Gson();
//        Reader json = Files.newBufferedReader(Paths.get("C:\\Users\\asone\\Documents\\Repos\\online-java-2019-asoneji03\\Classwork\\VendingMachine\\machine.json"));
//        Map<String, Item> map1 = gson.fromJson(json, Map.class);
//        return map1;

    }


