import java.util.Arrays ;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EscapeRoom EscapeRoom = new EscapeRoom();
        Player player = new Player();
        boolean win = false;
        int prevRow, prevCol;

        System.out.println("\n\nWelcome to the Escape room. Find the 4 code segments and the door to escape.\nNavigate through different sections of the escape room using the keywords 'up', 'down', 'left', 'right'\nEnter 'i' to view your inventory.\n\nYou are in a very dark room with limited visibility, not much to see in here right now.");
        while(win==false){
            
            System.out.println("Enter your move(up/down/left/right), open the map(map), or open your inventory(i):\n ");
            String in = input.nextLine();
            
            if(in.contains("up")){
                prevRow = player.getPosition().getRow();

                Move.moveUp(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());

                if (prevRow != player.getPosition().getRow()) {
                    EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
                }

                
            }

            else if(in.contains("down")){
                prevRow = player.getPosition().getRow();

                Move.moveDown(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());

                if (prevRow != player.getPosition().getRow()) {
                    EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
                }
            }
            else if(in.contains("left")){
                prevCol = player.getPosition().getColumn();

                Move.moveLeft(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                
                if (prevCol != player.getPosition().getColumn()) {
                    EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
                }
            }
            else if(in.contains("right")){
                prevCol = player.getPosition().getColumn();

                Move.moveRight(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
                
                if (prevCol != player.getPosition().getColumn()) {
                    EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
                }
            }
            else if(in.equals("i") || in.equals("I")){
                player.printInventory();
            }
            else if(in.equalsIgnoreCase( "map" )) {
            int[][] originalGameMap = EscapeRoom.getRoom(); 
            
            String[][] newGameMap = new String[originalGameMap.length][originalGameMap[0].length];

             for (String[] row : newGameMap) {
                 Arrays.fill(row, "-");
                 }
             newGameMap[player.getPosition().getRow()][player.getPosition().getColumn()] = "P";
             System.out.println(  ) ;
             System.out.println( (Arrays.deepToString(newGameMap)).replace("], ", "\n").replace("[", "").replace("[[", "").replace("]]", "").replace(",", "  ")) ;
             System.out.println(  ) ;
            }
            else {
                System.out.println("I don't understand that input. Please use the keywords 'up', 'down', 'left', 'right' to move, 'i' for inventory, or 'map' to open the map.");
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
                
                        if ((code + "").equals(EscapeRoom.getKey())){
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
