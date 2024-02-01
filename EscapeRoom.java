
public class EscapeRoom {

    private int[][] room = new int[4][4];

    // Constructor to call initializeMatrix to create the matrix.

    public EscapeRoom(){
        initializeMatrix();
    }

    // getter method to return the escape room

    public int[][] getRoom(){
        return room;
    }

    /*
     *
     *            col
     *         0  1  2  3
     *      0 [0][0][8][0]
     *  row 1 [4][0][0][0]
     *      2 [0][1][0][9]
     *      3 [6][0][0][-1]
     * 
     * room[1][0]=4 is key digit 1 ("1-4")
     * room[0][2]=8 is key digit 2 ("2-8")
     * room[2][3]=9 is key digit 3 ("3-9")
     * room[3][0]=6 is key digit 4 ("4-6")
     * room[3][3]=-1 is door
     * 
     * player starting position is room[2][1]
     * 
     * Method to initialize the matrix and place all keys and the door
     */

    public void initializeMatrix(){
        
        for(int i=0; i<room.length; i++){
            for(int j=0; j<room[0].length; j++){
                room[i][j] = 0;
            }
        }

        // adding the keys and the door at their locations on the grid
        room[1][0]=4;
        room[0][2]=8;
        room[2][3]=9;
        room[3][0]=6;
        room[3][3]= -1;

    }

    /*Method made to check the section of the room that player is in. 
    * Check whether the room contains a code segment, contains the keypad or is empty. 
    */

    public void roomCheck(int[][] room, Player player){
        int val = room[player.getPosition().getRow()][player.getPosition().getColumn()];

        if(val != 0 && val != -1){

            if (val == 4) {
                player.updateInventory("1-4");
                System.out.println("You found part of the code: 1-4" );
                room[1][0] = 0;
            } else if (val == 8) {
                player.updateInventory("2-8");
                System.out.println("You found part of the code: 2-8" );
                room[0][2] = 0;
            } else if (val == 9) {
                player.updateInventory("3-9");
                System.out.println("You found part of the code: 3-9" );
                room[2][3] = 0;
            } else if (val == 6){
                player.updateInventory("4-6");
                System.out.println("You found part of the code: 4-6" );
                room[3][0] = 0;
            }

        } else if (val == -1) {
            System.out.println("You found the key pad to exit the room.");

        } else {
            System.out.println("Nothing to see in this part of the room, keep looking!");
        }
    }
}
