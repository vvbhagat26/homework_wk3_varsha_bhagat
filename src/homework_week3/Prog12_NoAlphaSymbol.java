package homework_week3;

import java.util.Scanner;

public class Prog12_NoAlphaSymbol {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter userInput");
        String userInput= obj.next();

        if(isNumber(userInput)){
            System.out.println("The input value '" + userInput + "' is a number.");
        } else if (isAlphabet(userInput)) {
            System.out.println("The input value '" + userInput + "' is an alphabet.");
        } else {
            System.out.println("The input value '" + userInput + "' is a symbol.");
        }
        }
    public static boolean isNumber(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isAlphabet(String value) {
        return value.matches("[a-zA-Z]+");
    }
}


