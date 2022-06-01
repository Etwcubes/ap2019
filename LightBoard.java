public class LightBoard {
    public int numRows;
    public int numCols;

    private boolean [][] lights;

    public LightBoard(int numRows, int numCols){
        this.numRows = numRows;
        this.numCols = numCols;
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                int min = 1;
                int max = 10;
                int outCome = (int) (Math.random()*(max-min+1)+min);
                System.out.println(outCome);
                if (outCome <= 4){
                    lights[i][j] = true;
                } else{
                    lights[i][j] = false;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        int countOn = 0;
        int countOff = 0;
        boolean result = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if ((i == row) && (j == col)){
                    for (int x = i; x < numCols; x++){
                        if (lights[i][x] == true){
                            countOn++;
                        }else{
                            countOff++;
                        }
                    }
                    if (countOn%2 == 0){
                        result = false;
                    }
                    if (countOff%3 == 0){
                        result = true;
                    }
                    if ((countOn%2 != 0) && (countOff%3 != 0)){
                        result = lights[i][j];
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LightBoard myLightBoard = new LightBoard(5, 5);
        for (int i = 0; i < myLightBoard.numRows; i++) {
            System.out.println('\n');
            for (int j = 0; j < myLightBoard.numCols; j++) {
                System.out.println(myLightBoard.lights[i][j]);
            }
        }
    }

}
