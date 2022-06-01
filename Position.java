public class Position {
    public int r;
    public int c;

    public Position(int r, int c){
        this.r = r;
        this.c = c;
    }

    public static Position findPosition(int num, int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == num){
                    Position result = new Position(i, j);
                    return result;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] result = new Position[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] ericW2dArray = { {1,2,3}, {4,5,6} };
        Position[][] test2 = getSuccessorArray(ericW2dArray);

        for (int i = 0; i < test2.length; i++){
            for (int j = 0; j < test2[0].length; j++){
                if(test2[i][j] != null)
                System.out.print(test2[i][j].r + " " + test2[i][j].c + "\r\n");
                else System.out.println("null");
            }
        }

    }
}
