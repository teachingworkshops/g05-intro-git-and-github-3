public class Point {

    private int row, col;
    
    //Point object constructor.
    public Point(int row, int column){
        this.row = row;
        this.col = column;
    }

    //method to get current row position
    public int getRow(){
        return row;
    }

    //set row number for players position
    public void setRow(int row){
        this.row = row;
    }

    //method for retrieving current column
    public int getColumn(){
        return col;
    }

    //set column number for players position
    public void setColumn(int column){
        this.col = column;
    }

    
}

