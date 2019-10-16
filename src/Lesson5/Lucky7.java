package Lesson5;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int rolls = 0;
        int maxrolls=0;
        int money;
        int maxmoney=0;
        System.out.println("How many dollars do you have?");
        money = s.nextInt();

        
        while (true) {
            d1.roll();
            d2.roll();
            rolls++;
            int total = d1.getValue() + d2.getValue();
            if (total == 7){ money= money + 4; 
                if (money > maxmoney){
                     maxmoney=money;
                     maxrolls=rolls;
                }}
            else if(total!=7) money = money -1;
            if(money==0) break;

        }
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.println("You should have quit after "+ maxrolls+" rolls, with $"+ maxmoney);
        
    }

}



