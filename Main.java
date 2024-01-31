import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EscapeRoom EscapeRoom = new EscapeRoom();
        Player player = new Player();
        boolean win = false;

        System.out.println("Welcome to the Escape room. I am your personal guide!\nNavigate through different rooms using the keywords 'up', 'down', 'left', 'right'\nEnter 'i' to view your inventory.\n\nYou are in a very dark room with limited visibility, not much to see in here right now.");

        while(win==false){
            
            System.out.println("Enter your move(up/down/left/right):\n ");
            String in = input.nextLine();
            
            if(in.contains("up")){
     
                Move.moveUp(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);

                // Need to implement something similar to this so it doesnt print 2 things, you hit wall and room is empty
                // for some reason key with val 6 and door cannot be found when you put this if statement
                // if (player.getPosition.getRow != 0){
                //     EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
                // }
                
            }

            else if(in.contains("down")){
                Move.moveDown(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
            }
            else if(in.contains("left")){
                Move.moveLeft(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
            }
            else if(in.contains("right")){
                Move.moveRight(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
            }
            else if(in.equals("i") || in.equals("I")){
                player.printInventory();
            }
            else {
                System.out.println("I don't understand that input. Please use the keywords 'up', 'down', 'left', 'right'");
            }

            if (player.getPosition().getRow() == 3 && player.getPosition().getColumn() == 3){
                System.out.println("Enter the 4 digit code to open this door.\n");
                player.printInventory();
                
                int retry = 1;
                while(retry == 1){
                    String inputStr = input.nextLine();
                
                    if (inputStr.equals("f")) {
                        break;
                    }
                
                    try {
                        int code = Integer.parseInt(inputStr);
                
                        if (code == 4896){
                            win = true;
                            break;
                        } else {
                            System.out.println("Incorrect code. Input 'f' to leave or enter a different code.\n");
                            player.printInventory();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. This keypad only accepts numbers. Please enter a number or 'f' to leave.");
                    }
                }
                
            }
        }
        System.out.println("You have escaped! Welcome to safety.");
        input.close();
    }
}
