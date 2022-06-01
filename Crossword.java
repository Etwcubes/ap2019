public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares){
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int rows = puzzle.length;
        int cols = puzzle[0].length;
        int label = 1;
        for(int i = 0; i < blackSquares.length; i++) {
            for (int j = 0; j < blackSquares[i].length; j++) {
                if (blackSquares[i][j] == true){
                    puzzle[i][j] = new Square(true, 0);
                }
                else if (toBeLabeled(i, j, blackSquares) == true){
                    puzzle[i][j] = new Square(false, label);
                    label++;
                }else if ((toBeLabeled(i, j, blackSquares) == false) && (blackSquares[i][j] == false)){
                    puzzle[i][j] = new Square(false, 0);
                }

            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
        if (blackSquares[r][c] == true){
            return false;
        }
        else if ((r == 0) || (c == 0)){
            return true;
        }
        else if ((blackSquares[r-1][c] == true)  ||  (blackSquares[r][c-1]) == true){
            return true;
        }
        else if ((blackSquares[r-1][c] == true)  &&  (blackSquares[r][c-1]) == true){
            return true;
        }
        else {
            return false;
        }
    }
}
