package Lesson5;

import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);

        
        String name;
        int score;
        int avgstud1;
        int avgstud2;
        int highscorestud1;
        int highscorestud2;
        while (true) {
            //input student 1 data
            System.out.println("Enter name for first student (min 1 letter) > ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s > ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);

            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
               scan.nextLine(); 
            }
        }

        scan.nextLine(); //clear scanner buffer
        System.out.println("\n--------------------------\n");
        //input the student 2 data
        while (true) {
            System.out.println("Enter name for second student > (min 1 letter) ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s > ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
            scan.nextLine();}
        }
        scan.nextLine();

        System.out.println("\n-----------------------\n");
        //output the students information
        System.out.println(stu1);
        System.out.println(stu2);

        avgstud1 = stu1.getAverage();
        avgstud2 = stu2.getAverage();

        if (avgstud1 > avgstud2) {
            System.out.format("\n\nThe student with the highest average is %s", stu1.getName());
        } else if (avgstud2 > avgstud1) {
            System.out.format("\n\nThe student with the highest average is %s", stu2.getName());
        }

        highscorestud1 = stu1.getHighScore();
        highscorestud2 = stu2.getHighScore();

        if (highscorestud1 > highscorestud2) {
            System.out.format("\n\nthe student with the highest score is %s", stu1.getName());
        } else if (highscorestud2 > highscorestud1) {
            System.out.format("\n\nThe student with the highest score is %s", stu2.getName());
        }

    }

}

