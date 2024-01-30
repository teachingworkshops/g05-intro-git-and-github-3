import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EscapeRoom EscapeRoom = new EscapeRoom();
        Player player = new Player();
        boolean win = false;

        while(win==false){
            System.out.print("Enter your move(up/down/left/right): ");
            String in = input.nextLine();
            if(in.contains("up")){
                System.out.println(player.getPosition().getRow());
                Move.moveUp(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                System.out.println(player.getPosition().getRow());
            }
        }
        input.close();
    }
}
