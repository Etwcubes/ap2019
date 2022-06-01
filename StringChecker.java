public interface StringChecker {
    public boolean isValid(String str);
}


    class CodeWordChecker implements StringChecker{
        int min;
        int max;
        String cantOccur;
        //1st constructor with 3 params
        public CodeWordChecker(int min, int max, String cantOccur){
            this.min = min;
            this.max = max;
            this.cantOccur = cantOccur;
        }

        //2nd constructor with 1 param
        public CodeWordChecker(String cantOccur){
            this.min = 6;
            this.max = 20;
            this.cantOccur = cantOccur;
        }

        public int getMin(){
            return min;
        }
        public int getMax(){
            return max;
        }
        public String getCantOccur(){
            return cantOccur;
        }

        public boolean isValid(String str){
            boolean result = false;
            int count = 0;
            if ((str.length() >= min) && (str.length() <= max)) {
                for (int i = 0; i <= str.length() - cantOccur.length(); i++) {
                    if (str.substring(i, i + cantOccur.length()).equals(cantOccur)){
                        count++;
                    }
                }
                if (count == 0){
                    result = true;
                }

            }

            return result;
        }

        public static void main(String[] args) {
            StringChecker sc1 = new CodeWordChecker(5, 8, "$^&&");
            System.out.println(sc1.isValid("happy$^&&"));
        }

    }





