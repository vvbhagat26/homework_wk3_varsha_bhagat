package homework_week3;

import java.util.Scanner;

public class Prog2_Leapyear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a year");
        int year = obj.nextInt();
        if ((year % 4 == 0) &&  (year % 100 != 0)) {

                System.out.println("leap year");}

            else if((year % 4 == 0) &&  (year % 100 == 0) && (year%400==0)) {
                System.out.println("Not a leap year");
            }else {
            System.out.println(year + "year is not a leap year");}
            obj.close();
        }
    }



