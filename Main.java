import java.util.Arrays ;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EscapeRoom EscapeRoom = new EscapeRoom();
        Player player = new Player();
        boolean win = false;

        System.out.println("\n\nWelcome to the Escape room. Find the 4 code segments and the door to escape.\nNavigate through different sections of the escape room using the keywords 'up', 'down', 'left', 'right'\nEnter 'i' to view your inventory.\n\nYou are in a very dark room with limited visibility, not much to see in here right now.");
        while(win==false){
            
            displayInstructions();
            String in = input.nextLine();
            
            if(in.contains("up")){
                Move.moveUp(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
            }

            else if(in.contains("down")){
                Move.moveDown(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
            }
            else if(in.contains("left")){
                Move.moveLeft(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
            }
            else if(in.contains("right")){
                Move.moveRight(EscapeRoom.getRoom(), player, player.getPosition().getRow(), player.getPosition().getColumn());
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
            else if(in.equalsIgnoreCase( "search" )) {
                searchCommand(EscapeRoom, player);
            }
            else {
                System.out.println("I don't understand that input.");
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

    /**
     * Checks if a room has an item
     * @param EscapeRoom escape room object to check the room in
     * @param player player whos inventory will be updated
     */
    private static void searchCommand(final EscapeRoom EscapeRoom, final Player player){
        EscapeRoom.roomCheck(EscapeRoom.getRoom(), player);
    }

    /**
     * Displays instructions for the player
     */
    private static void displayInstructions(){
        String instructions = 
            """

            Options:
                Move(up/down/left/right)
                Open the map(map)
                Open your inventory(i)
                Search the room(search)

            Enter your action:""";      
            System.out.println(instructions);  
    }



}
