import java.util.ArrayList;
public class RandomStringChooser {
    public String[] word;
    public RandomStringChooser(String[] word){
        this.word = word;
    }
    public String getNext(){
        int min = 0;
        int max = word.length;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = min; i < max; i++){
            list.add(i);
        }
        if (list.size() == 0){
            return "NONE";
        }
        int index = numberGen();
        String temp = word[list.get(index)];
        list.remove(list.get(index));
        return temp;

    }
    public int numberGen(){
        int min = 0;
        int max = word.length;
        int randomNum = min + (int)(Math.random() * max);
        max--;
        return randomNum;

    }

    public int getLongth(){
        return word.length;
    }

}
