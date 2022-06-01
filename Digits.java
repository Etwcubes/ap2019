import java.util.ArrayList;

public class Digits {
    public int num;
    private ArrayList<Integer> digitList;
    private ArrayList<Integer> temperary;
    public Digits(int num){
        this.num = num;

        while (num > 0){  //Putting the digits into an arraylist
            int temp = num;
            int lastDigit = temp % 10;
            temperary.add(lastDigit);
            num /= 10;
        }
        for (int i = temperary.size()-1; i > 0; i--){
            digitList.add(temperary.get(i));
        }


    }
    public boolean isStrictlyIncreasing(){
        boolean result = true;
        for (int i = 0; i < digitList.size()-1; i++){
            if (digitList.get(i) > digitList.get(i+1)){
                result = false;
            }
        }
        return result;
    }
}
