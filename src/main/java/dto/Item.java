package dto;

public class Item {
    private String name;
    private double cost;
    private int inventoryCount;

    public Item(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {

        this.cost = cost;
    }

    public int getInventoryCount() {

        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }
}
