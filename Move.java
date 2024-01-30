public class Move {

    public static void moveUp(int[][] room, Player player, int row, int col){
        if (row == 0) {
            System.out.println("You hit a wall, you can't move there.");
        }
        room[row][col] = 0;
        room[row-1][col] = 1;
        row++;

        player.setPosition(row, col);
    }
    
    public static void moveDown(int[][] room,Player player, int row, int col) {
        if (row == 3) {
            System.out.println("You hit a wall, you can't move there.");
        }
    
        room[row][col]=0;
        room[row+1][col] = 1;
        row++;
        
        player.setPosition(row, col);
    }
    
    public static void moveLeft(int[][] room,Player player, int row, int col) {
        if (col == 0) {
            System.out.println("You hit a wall, you can't move there.");
        }
        room[row][col]=0;
        room[row][col-1] = 1;
        col--;

        player.setPosition(row, col);
    }

    public static void moveRight(int[][] room,Player player, int row, int col){
        if (col == 3) {
            System.out.println("You hit a wall, you can't move there.");
        }
        room[row][col]=0;
        room[row][col+1]=1;
        col++;

        player.setPosition(row, col);
}
}
