public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        int max = 10;
        int min = 1;
        int temp = (int) ((Math.random() * (max - min)) + min);
        //temp ---> 1,2,3,4,5,6,7,8,9,10
        if ((temp == 2) || (temp == 7)) {
            return (int) ((Math.random() * (-1 - (-10))) + (-10));
        }
        return (int) ((Math.random() * ((goalDistance / maxHops) * 2) - 0) + 0);

    }

    public boolean simulate(){
        int countthenumberofhops = 0;
        int sum = 0;
        boolean condition = false;
        while (!condition){
            if (sum >= goalDistance){

                return true;
            }
            else if (sum < 0){

                return true;
            }
            else if ((countthenumberofhops == maxHops) && (sum < goalDistance)){

                return false;
            }

            int temp = hopDistance();
            //System.out.println(temp);
            sum += temp;
            countthenumberofhops+=1;
        }
        return condition;
    }

    public double runSimulations(int num){
        int counttrue = 0;
        int countfalse = 0;
        for (int i = 0; i < num; i++){
            if (simulate() == true){
                counttrue++;
            }
            if (simulate() == false){
                countfalse++;
            }
        }
        System.out.println("true = " + counttrue);
        System.out.println("false = " + countfalse);
        return (double)counttrue/countfalse;
    }

    public static void main(String[] args) {
        FrogSimulation test = new FrogSimulation(24, 5);
        //System.out.print(test.simulate());
        System.out.println(test.runSimulations(400));

    }
}
