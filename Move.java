public class Move {

    public static void moveUp(int[][] position, int row, int col){
        if (row == 0) {
            System.out.println("You hit a wall, you can't move there.");
        }
        position[row][col] = 0;
        position[row-1][col] = 1;
        row = row-1;
    }
    
    public static void moveDown(int[][] position, int row, int col) {
        if (row == 3) {
            System.out.println("You hit a wall, you can't move there.");
        }
    
        position[row][col]=0;
        position[row+1][col] = 1;
        row=row+1;
        
    }
    
    public static void moveLeft(int[][] position, int row, int col) {
        if (col == 0) {
            System.out.println("You hit a wall, you can't move there.");
        }
        position[row][col]=0;
        position[row][col-1] = 1;
    }

    public static void moveRight(int[][] position, int row, int col){
        if (col == 3) {
            System.out.println("You hit a wall, you can't move there.");
        }
        position[row][col]=0;
        position[row][col+1]=1;
}
}
