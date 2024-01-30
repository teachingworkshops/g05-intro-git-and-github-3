public class Move {

    public static void moveUp(int[][] room, Player player, int row, int col){
        if (row == 0) {
            System.out.println("You hit a wall, you can't move there.");  
        } else {
            player.setPosition(row--, col);
        }
    }
    
    public static void moveDown(int[][] room,Player player, int row, int col) {
        if (row == 3) {
            System.out.println("You hit a wall, you can't move there.");
        } else {
            player.setPosition(row++, col);   
        }
    }
    
    public static void moveLeft(int[][] room,Player player, int row, int col) {
        if (col == 0) {
            System.out.println("You hit a wall, you can't move there.");
        } else {
            player.setPosition(row, col--);
        }
    }

    public static void moveRight(int[][] room, Player player, int row, int col){
        if (col == 3) {
            System.out.println("You hit a wall, you can't move there.");
        } else {
            player.setPosition(row, col++);
        }
}
}
