import java.util.ArrayList;

public class Player {
    private ArrayList <String> inventory;

    public Player () {

    }
    
    public void updateInventory(){

    }

    public void printInventory(){
        for (String item : inventory){
            System.out.print(item);
        }
    }

}
