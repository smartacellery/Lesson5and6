package Lesson6;

import java.util.Scanner;

public class PayrollInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;

        
        while (true) {
            emp = new Employee();
            //ask for name
            System.out.println("Enter data for new Employee\n--------------------------------\n");
            System.out.println(" >> Name or <enter> to quit:");
            name = scan.nextLine();
            //try to set name, if fail get out of program
            if (!emp.setName(name)) {
                break;
            }
            //if no break, fill in rest of data for employee
            //type
            while (true) {
                System.out.println(" >> Type: (" + emp.getTypeRules() + "): ");
                type = scan.nextInt();
                if (emp.setType(type)) {
                    break;
                }
                scan.nextLine();

            }
            //rate

            while (true) {
                System.out.println(" >> Rate: (" + emp.getRateRules() + "): ");
                rate = scan.nextInt();
                if (emp.setRate(rate)) {
                    break;
                }
                scan.nextLine();

            }
            //hours
            while (true) {
                System.out.println(" >> Hours: (" + emp.getHoursRules() + "): ");
                hours = scan.nextInt();
                if (emp.setHours(hours)) {
                    break;
                }
                scan.nextLine();

            }
             //when I get to here th emplyee has all valid data set to its properties
            //print the pay
            System.out.format("Weekly pay for %s is %.2f\n", emp.getName(), emp.getPay());
            System.out.println("");
           scan.nextLine();
            
        }
       


        System.out.println("Program ended");

    }

}