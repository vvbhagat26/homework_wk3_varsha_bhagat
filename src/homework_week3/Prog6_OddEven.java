package homework_week3;

import java.util.Scanner;

public class Prog6_OddEven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        obj.close();
    }
}
