import java.util.ArrayList;

public class Player {
    private ArrayList <String> inventory;
    private Point point;

    public Player (Point p) {
        this.inventory = new ArrayList<>();
        this.point = p;
    }

    public Point getPosition(){
        return point;
    }

    public void pickUpItem(String item){
        inventory.add(item);
    }

    public void listInventory(){
        for (String item : inventory){
            System.out.print(item);
        }
    }

}
