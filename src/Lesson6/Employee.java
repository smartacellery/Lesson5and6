package Lesson6;

public class Employee {

    
    //step 1 = instance variables
    private String name;
    private int type; //1 = FULL time employee , 2= PART time employee
    private double rate;
    private int hours;

    //step 2 = Constructor
    public Employee() {
        name = "";
        type = 0;
        rate = 0;
        hours = 0;
    }

    //step 3 = instance methods
    //these four return a "rule" message 
    public String getTypeRules() {
        return "1 or 2";
    }

    public String getNameRules() {
        return "non blank";
    }

    public String getRateRules() {
        return "between 6.75 and 30.50 inclusive";
    }

    public String getHoursRules() {
        return "between 1 and 60 inclusive";
    }

    //boolean setters
    //if incoming data breaks the rules the property WONT get set -false returned
    //if incoming data is OK, priperty is set, and true is returned
    //this accomplihes two things -> 
    //1) Protects the property rom being set to "bad data"
    //2) Sends a signal back to client class to let it know if property was set or not
    public boolean setName(String nm) {
        boolean nameblank = nm.equals("");
        if (nameblank) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    public boolean setType(int t) {
        boolean typeok = t == 1 || t == 2;
        if (typeok) {
            type = t;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRate(double rt) {
        boolean rateok = rt >= 6.75 && rt <= 30.50;
        if (rateok) {
            rate = rt;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHours(int h) {
        boolean hoursOk = h >= 1 && h <= 60;
        if (hoursOk) {
            hours = h;
        }
        return hoursOk;

    }

    public String getName() {
        return name;
    }

    public double getPay() {
        boolean overtime = (type == 1 && hours > 40);
        double pay;
        if (overtime) {
            pay = (hours - 40) * rate * 2 + rate * 40;
        } else {
            pay = hours * rate;
        }
        return pay;
    }
    
    public int geType(){
        return type;
    }

}