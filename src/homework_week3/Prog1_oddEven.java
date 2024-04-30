package homework_week3;

import java.util.Scanner;

public class Prog1_oddEven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        String s = (number%2==0)?"number is even":"number is odd";
        System.out.println("number is "+ s);
        obj.close();
    }
}
