import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

    public WordPairList(String[] words){
        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                WordPair temp = new WordPair(words[i], words[j]);
                allPairs.add(temp);
            }
        }
    }
    public int numMatches(){
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++){
            if (allPairs.get(i).getFirst() == allPairs.get(i).getSecond()){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String[] myList = {"Bob", "Bill", "Richard", "Bob", "Bill", "Richard"};
        WordPairList name = new WordPairList(myList);
        System.out.println(name.numMatches());

        for (int i = 0; i < name.allPairs.size(); i++){
            System.out.println(name.allPairs.get(i).getFirst() + " " + name.allPairs.get(i).getSecond());
        }

    }
}
