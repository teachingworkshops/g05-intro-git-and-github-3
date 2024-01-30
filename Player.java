import java.util.ArrayList;

public class Player {

    private ArrayList <String> inventory;
    //sets players intial starting position to 2,1
    private Point position = new Point(2, 1);

    //basic player constructor
    public Player(){
    }
    
    //method that must be called by EscapeRoom roomCheck() if player finds a key
    //adds a string to the arraylist inventory 
    public void updateInventory(){

    }

    //method used to print current inventory
    public void printInventory(){
        System.out.println("Inventory:");
        for (String item : inventory){
            System.out.println(item);
        }
    }

    //method for accessing player's current position throughout other classes useful for roomCheck()
    public Point getPosition(){
        return this.position;
    }

    //method for updating player's position used in every move function
    public void setPosition(int row, int col){
        this.position.setRow(row);
        this.position.setColumn(col);
    }
}
