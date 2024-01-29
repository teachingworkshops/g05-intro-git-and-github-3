
public class EscapeRoom {
    private boolean win;
    private Player player;

    private Point startPosition = new Point(0, 0);

    public EscapeRoom(){
        this.player = new Player(startPosition);
        this.win = false;
    }

    public void exitConsolInteract(){
        if(win){
            System.out.println("Pass: Please enter the keypad code");
        } else {
            System.out.println("Error: You have not found all keypad values");
        }
    }
}
