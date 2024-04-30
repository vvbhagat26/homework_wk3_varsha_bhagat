package homework_week3;

import java.util.Scanner;

public class Prog10_Calculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter num1");
        int num1= obj.nextInt();
        System.out.println("enter num2");
        int num2= obj.nextInt();
        System.out.println("enter symbol");
        char symbol = obj.next().charAt(0);
        int result;

        switch (symbol) {
            case '+':
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid arithmetic symbol. Please use +, -, *, or /.");
        }

        obj.close();

    }
}
