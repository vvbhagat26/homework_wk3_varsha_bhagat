package homework_week3;

import java.util.Scanner;

public class Prog9_AlphabetCity {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter alphabet from A to F");
        char inputChar=obj.next().toUpperCase().charAt(0);
        //String cityName;
        switch(inputChar) {
            case 'A':
                System.out.println("Amsterdam");
                break;
            case 'B':
                System.out.println("Berlin");
                break;
            case 'C':
                System.out.println("Colmbo");
                break;
            case 'D':
                System.out.println("Dublin");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid entry");
        }
            obj.close();
        }
    }


