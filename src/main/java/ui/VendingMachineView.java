package ui;

import dao.VendingMachineDao;
import dao.VendingMachineDaoFileImpl;
import dto.Item;

import java.util.List;

public class VendingMachineView {
    private UserIO io;

    public VendingMachineView(UserIO io){
        this.io = io;
    }

    public void displayMenu(List<Item> items){
        io.print("Main Menu");
        for(int i = 0; i< items.size(); i++) {
            if (items.get(i).getInventoryCount() > 0) {
                io.print(i+ 1 + ". " + items.get(i).getName() + " - $" + items.get(i).getCost() + " - In stock:" + items.get(i).getInventoryCount());

            }
        }
    }

    public double getMoneyAmount(List<Item> items){
        displayMenu(items);
        return io.readDouble("Please enter money.");
    }

    public int getItemSelection(List<Item> items){
        displayMenu(items);
        return io.readInt("Please select from the above choices. ", 1, items.size());
    }

    public void displayChangeOwed(Item item, double moneyGiven){
        double moneyOwed = moneyGiven - item.getCost();
        io.print("Change Returned: $" + moneyOwed);
    }


//

//    public void displayPurchase(List<Item> items){
//        int userSelection = getItemSelection(items);
//        Item itemSelected = items.get(userSelection);
//        int moneyGiven = 0;
//        double moneyOwed = moneyGiven - itemSelected.getCost();
//        if(moneyGiven < moneyOwed){
//            io.print("Insufficient funds to purchase this item.");
//            io.print("You have entered $" + moneyGiven);
////        }else if(moneyGiven == moneyOwed){
////            io.print("Please take your item.");
////        }else{
////            io.print("Please take your change: $" + moneyOwed);
//        }
//
//    }


//    public void displayEvenExchange(){
//        io.print("Your change is $0.");
//    }
//
//    public void displayInsufficientFundsErrorMessage(){
//        io.print("Please enter additional funds to make your purchase.");
//    }

    public int printMenuPopulateInventory(){
        io.print("1. Add Vending Item");
        io.print("2. View List of Vending Items");
        io.print("3. View Count of Vending Items");
        io.print("4. Remove Vending Item from Inventory");
        io.print("5. Exit inventory menu");
        return io.readInt("Please select from the above choices to populate vending inventory.", 1, 5);

    }

    public Item getNewItemInfo(){
        String name = io.readString("Enter item name");
        double cost = io.readDouble("Enter item cost");
        int inventoryCount = io.readInt("Enter number of this item in inventory");
        Item currentItem = new Item();
        currentItem.setName(name);
        currentItem.setCost(cost);
        currentItem.setInventoryCount(inventoryCount);
        return currentItem;
    }

    public void displayCreateItemBanner(){
        io.print("===Create Item for Vend===");
    }

    public void displayCreateSuccessBanner(){
        io.readString("Item added to vending machine. Hit enter to continue");
    }

    public void displayItemList(List<Item> vendingItems){
        for(Item currentItem : vendingItems){
            io.print(currentItem.getName() + " " + currentItem.getCost() + " " + currentItem.getInventoryCount());
        }
        io.readString("Please hit enter to continue.");

    }

    public void displayDisplayAllBanner(){
    io.print("===Display All Items===");
    }

    public void displayDisplayItemBanner(){
        io.print("===Display Item===");
    }
    public String getItemNameChoice(){
        return io.readString("Please enter the item name.");

    }

    public void displayItem(Item item){
        if(item != null){
            io.print("Item:" + item.getName());
            io.print("Cost: " + item.getCost());
        }else{
            io.print("No such item found.");
        }
        io.readString("Please hit enter to continue.");
    }

//    public void displayUserSelectForPurchase(Item item){
//        if(item.getInventoryCount() > 0){
//            io.print("Would you like to purchase this item? Please enter Y or N");
//        }else{
//            io.print("The item you selected is sold out.");
//        }
//    }


    public void countInventoryBanner(){
        io.print("===Display Count of Selected Vending Item===");
    }

    public void displayInventoryCountOfItem(Item item){
        if(item != null){
            io.print("Item: " + item.getName());
            io.print("Inventory Count: " + item.getInventoryCount());
        }
    }

    public void displayRemoveItemBanner(){
        io.print("===Remove Item From Inventory===");
    }

    public void displayRemoveItemSuccessBanner(){
        io.print("===Item is successfully removed from inventory===");

    }

    public void displayExitBanner(){

        io.print("Good Bye!");
    }

    public void displayExitInventoryBanner(){

        io.print("Exiting Inventory");
    }

    public void displayUnknownCommandBanner(){

        io.print("Unknown Command!!");
    }

    public void displayErrorMessage(String errorMsg){
        io.print("===ERROR===");
        io.print(errorMsg);
    }

}
