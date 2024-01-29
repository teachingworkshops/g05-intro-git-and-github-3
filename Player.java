import java.util.ArrayList;

public class Player {
    private ArrayList <String> inventory;
    private Point point;
    private int score; 


    public Player (Point p) {
        this.inventory = new ArrayList<>();
        this.point = p;
        this.score = 0; 
    }

    public Point getPosition(){
        return point;
    }

    public void movePosition(int row, int col){
        point = new Point(row, col);
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
