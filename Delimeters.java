import java.util.ArrayList;
import java.util.Stack;
public class Delimeters {
    private String openDel;
    private String closeDel;

    public Delimeters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals(openDel)){
                result.add(tokens[i]);
            }
            if (tokens[i].equals(closeDel)){
                result.add(tokens[i]);
            }
        }
        return result;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        boolean result = false;
        int countOpen = 0;
        int countClose = 0;
        for (int i = 0; i < delimiters.size(); i++){
            if (delimiters.get(i).equals(openDel)){
                countOpen++;
            }
            if (delimiters.get(i).equals(closeDel)){
                countClose++;
                if (countClose > countOpen){
                    result = false;
                    break;
                }
            }
        }
        if (countOpen >= countClose){
            result = true;
        }
        return result;
    }



}
