import java.util.ArrayList;
import java.util.List;

public class escapeRoom {
    
    private List<String> puzzles;
    private boolean win;
    private Player player;

    private Point startPosition = new Point(0, 0);

    public escapeRoom(){
        this.player = new Player(startPosition);
        this.win = false;
        this.puzzles = new ArrayList<String>();
    }

    public void movePlayer(String move){
        move.toLowerCase();

        // still need to add in out of bound checks; 

        if (move.equals("up")) {
            int newRow = player.getPosition().getRow() + 1;
            player.movePosition(newRow, player.getPosition().getColumn());
        } else if ((move.equals("right"))) {
            int newCol = player.getPosition().getColumn() + 1;
            player.movePosition(player.getPosition().getColumn(),newCol);
        } else if ((move.equals("left"))) {
            int newCol = player.getPosition().getColumn() - 1;
            player.movePosition(player.getPosition().getColumn(),newCol);
        } else if ((move.equals("down"))){
            int newRow = player.getPosition().getRow() - 1;
            player.movePosition(newRow, player.getPosition().getColumn());
        } 
    }
    
    public void solvePuzzle(){
        
    }

    public void exitConsolInteract(){
        if(win){
            System.out.println("Pass: Please enter the keypad code");
        } else {
            System.out.println("Error: You have not found all keypad values");
        }
    }
}
