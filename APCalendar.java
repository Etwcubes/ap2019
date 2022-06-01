import java.util.Date;

public class APCalendar {
    private static boolean isLeapYear(int year){
        if(year%4==0){
            return true;
        }
        return false;
    }
    public static int numberOfLeapYears(int year1, int year2){
        int count = 0;
        for (int i = year1; i < year2; i++){
            if (isLeapYear(i) == true){
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year){
        return new Date(year, 0, 1).getDay();
    }
    public static int dayOfYear(int month, int day, int year){
        int count = 0;
        int[] notLeapYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] LeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year) == false){
            for (int i = 0; i < notLeapYear.length; i++){
                if (i != month-1){
                    count += notLeapYear[i];
                } else{
                    count += day;
                    break;
                }
            }
        } else{
            for (int i = 0; i < notLeapYear.length; i++){
                if (i == 1){
                    count += 29;
                }
                if (i != month-1){
                    count += LeapYear[i];
                } else{
                    count += day;
                    break;
                }
            }
        }
        return count;
    }

    public static int dayOfWeek(int month, int day, int year){
        return new Date(year, month-1, day-1).getDay();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear(4, 29, 2022));
    }
}
