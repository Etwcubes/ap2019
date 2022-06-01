import java.util.HashMap;
public class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c){
        int[] result = new int[arr2D[0].length];
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                if (j == c) {
                    result[i] = arr2D[i][j];
                }
            }
        }
        return result;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2){
        boolean result = false;
        HashMap<Integer, Integer> ericWMap = new HashMap<Integer, Integer>();
        int countTrue = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            ericWMap.put(arr1[i], arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++){
            if (ericWMap.containsKey(arr2[i])){
                countTrue++;
                count++;
            }else{
                ericWMap.put(arr2[i], arr2[i]);
                count++;
            }
        }
        if (countTrue == count){
            result = true;
        }
        return result;
    }

    public static boolean containsDuplicates(int[] arr){
        HashMap<Integer, Integer> ericWMap = new HashMap<Integer, Integer>();
        boolean result = false;
        for (int i = 0; i < arr.length; i++){
            if (ericWMap.containsKey(arr[i])){
                result = true;
            } else{
                ericWMap.put(arr[i], arr[i]);
            }
        }
        return result;
    }

    public static boolean isLatin(int[][] square){
        boolean result = false;
        if (containsDuplicates(square[0]) == false){
            for (int i = 1; i < square[0].length; i++){
                if (hasAllValues(square[0], square[i]) == true){
                    for (int j = 1; j < square[0].length; j++){
                        if(hasAllValues(square[0], square[j]) == true){
                            result = true;
                        }
                    }
                }
            }
        }
        return result;
    }
}
