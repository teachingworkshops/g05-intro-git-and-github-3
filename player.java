import java.util.ArrayList;

public class Player {
    private ArrayList <String> inventory;
    private int row, colm, score; 


    public Player (int row, int column) {
        this.inventory = new ArrayList<>();
        this.row = row;
        this.colm = column;
        this.score = 0; 
    }
    
     // Returns the row and column of the player within the escape-room grid

    public int row(){
        return row;
    }

    public int column(){
        return colm;
    }

    // Allows for the user to add the picked up item to their inventory

    public void pickUpItem(String item){
        inventory.add(item);
    }

    public void listInventory(){
        for (String item : inventory){
            System.out.print(item);
        }
    }

    //Allows for the user to use the selected item in their inventory but also checks whether they contain the item.

    public void useItem(String object){
        if (inventory.contains(object)) {
            System.out.println("You used:" + object);
            inventory.remove(object);
        } else {
           System.out.println("You do not have this item."); 
        }
    }

    public int getScore(){
        return score;
    }

    public void updateScore(){
        score++;
    }

}
