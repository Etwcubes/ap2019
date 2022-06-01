import java.util.ArrayList;

public class StepTracker {
        public int steps;
        private ArrayList<Integer> ericW = new ArrayList<Integer>();
        public StepTracker(int steps){
            this.steps = steps;
        }

        public void addDailySteps(int num){
            ericW.add(num);
        }

        public int activeDays(){
            int count = 0;
            for (int i = 0; i < ericW.size(); i++){
                if (ericW.get(i) >= 10000){
                    count++;
                }
            }
            return count;
        }

        public double averageSteps(){
            double count = 0;
            for (int i = 0; i < ericW.size(); i++){
                count += ericW.get(i);
            }
            count /= ericW.size()+1;
            return count;
        }






}
