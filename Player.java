import java.util.ArrayList;

public class Player {

    private ArrayList <String> inventory;
    private Point position = new Point(2, 1);

    public Player () {

    }
    
    public void updateInventory(String codeSeg){
        inventory.add(codeSeg);
    }

    public void printInventory(){
        for (String item : inventory){
            System.out.print(item);
        }
    }

    public Point getPosition(){
        return this.position;
    }

    public void setPosition(int row, int col){
        this.position.setRow(row);
        this.position.setColumn(col);
    }
}
