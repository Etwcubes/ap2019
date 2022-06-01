public class Phrase {
    private String currentPhrase;
    public Phrase(String p){
        currentPhrase = p;
    }

    public int findNthOccurrence (String str, int n){
        int result;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < currentPhrase.length()-str.length(); i++){
            if (currentPhrase.substring(i, i + str.length()).equals(str)){
                count++;
                if (count == n){
                    temp = i;
                    break;
                }
            }
            if (i == currentPhrase.length()-str.length()){
                temp = -1;
            }
        }
        result = temp;
        return result;
    }

    public void replaceNthOccurrence(String str, int n, String repl){
        int count = 0;
        String result = "";
        for (int i = 0; i < currentPhrase.length(); i++){
            if (i == findNthOccurrence(str, n)){
                result += repl;
                i+= str.length()-1;
            }else{
                result += currentPhrase.charAt(i);
            }
        }

    }

    public int findLastOccurrence(String str){
        int result = 0;
        for (int i = str.length()-1; i > 0+str.length(); i--){
            if (currentPhrase.substring(i-str.length(), i).equals(str)){
                result = i;
                break;
            }
        }
        return result;
    }


    public String toString(){
        return currentPhrase;
    }


    public static void main(String[] args) {
        Phrase myPhrase = new Phrase("a cat ate late");


        myPhrase.findLastOccurrence("xx");

    }
}
