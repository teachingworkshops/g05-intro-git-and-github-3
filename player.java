import java.util.ArrayList;

public class player {
    private ArrayList <String> inventory;
    private int row, colm; 


    public player (int row, int column) {
        this.inventory = new ArrayList<>();
        this.row = row;
        this.colm = column;
    }

    public int row(){
        return row;
    }

    public int column(){
        return colm;
    }

    public void pickUpItem(String item){
        inventory.add(item);
    }

    public void listInventory(){
        for (String item : inventory){
            System.out.print(item);
        }
    }

    public void useItem(String object){
        if (inventory.contains(object)) {
            System.out.println("You used:" + object);
            inventory.remove(object);
        } else {
           System.out.println("You do not have this item."); 
        }
    }


}
