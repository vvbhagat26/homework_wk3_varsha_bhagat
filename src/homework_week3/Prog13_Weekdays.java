package homework_week3;

import java.util.Scanner;

public class Prog13_Weekdays
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number from 1 to 7");
        int number=obj.nextInt();

        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                default:
                System.out.println("Week contains 1 to 7 days");

        }
    }

}
