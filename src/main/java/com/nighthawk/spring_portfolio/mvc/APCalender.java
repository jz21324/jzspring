import java.util.HashMap;
import java.util.ArrayList;

public class APCalender {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    private static boolean isLeapYear(int year) {
        // implementation not shown
        if (year % 4 == 0 && !(year % 100 == 0)) {
            return true;    
        }
        else if (year % 400 == 0) {
            return true;
        }
        return false;
        }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    private static int firstDayOfYear(int year) {
        // implementation not shown
        
        int i = year;
        ArrayList<String> name = new ArrayList<String>();
        name.add("Sunday");
        name.add("Monday"); //adds different sports to the array
        name.add("Tuesday");
        name.add("Wednesday");
        name.add("Thursday");
        name.add("Friday");
        name.add("Saturday");

        if (isLeapYear(year)) {
            if (year % 7 == 0) {
                System.out.println(name.get(0));
            }
            else if (year % 7 == 1) {
                System.out.println(name.get(1));
            }
            else if (year % 7 == 2) {
                System.out.println(name.get(2));
            }
            else if (year % 7 == 3) {
                System.out.println(name.get(3));
            }
            else if (year % 7 == 4) {
                System.out.println(name.get(4));
            }
            else if (year % 7 == 5) {
                System.out.println(name.get(5));
            }
            else if (year % 7 == 6) {
                System.out.println(name.get(6));
            }
            else {
                System.out.println(name.get(7));
            }
        }

        else {
            if (year % 7 == 0) {
                System.out.println(name.get(0));
            }
            else if (year % 7 == 1) {
                System.out.println(name.get(1));
            }
            else if (year % 7 == 2) {
                System.out.println(name.get(2));
            }
            else if (year % 7 == 3) {
                System.out.println(name.get(3));
            }
            else if (year % 7 == 4) {
                System.out.println(name.get(4));
            }
            else if (year % 7 == 5) {
                System.out.println(name.get(5));
            }
            else if (year % 7 == 6) {
                System.out.println(name.get(6));
            }
            else {
                System.out.println(name.get(7));
            }
        }
        return 0;

        //String[] name = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
        
    }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    private static int dayOfYear(int month, int day, int year) {
        // implementation not shown
        HashMap<Integer, Integer> getday = new HashMap<Integer, Integer>();

        getday.put(1, 0);
        getday.put(2, 31);
        getday.put(3, 59);
        getday.put(4, 89);
        getday.put(5, 120);
        getday.put(6, 150);
        getday.put(7, 181);
        getday.put(8, 211);
        getday.put(9, 242);
        getday.put(10, 272);
        getday.put(11, 303);
        getday.put(12, 333);

        if (isLeapYear(year) && month >= 3) {
            return getday.get(month) + day + 1;
        }
        else {
            return getday.get(month) + day;
        }
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
         // to be implemented in part (a)
        
        return 0;
        }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        // to be implemented in part (b)
        return 0;
        }

    /** Tester method */
    public static void main(String[] args) {
        // Private access modifiers
        System.out.println("isLeapYear: " + APCalender.isLeapYear(2022));
        System.out.println("firstDayOfYear: " + APCalender.firstDayOfYear(2019));
        System.out.println("dayOfYear: " + APCalender.dayOfYear(3, 1, 2020));

        // Public access modifiers
        System.out.println("numberOfLeapYears: " + APCalender.numberOfLeapYears(2000, 2022));
        System.out.println("dayOfWeek: " + APCalender.dayOfWeek(1, 1, 2022));
    }
}