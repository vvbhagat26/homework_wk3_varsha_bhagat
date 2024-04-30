package homework_week3;

import java.util.Scanner;

public class Prog8_IfCity {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter alphabet from A to F");
        char inputChar=obj.next().toUpperCase().charAt(0);

        if(inputChar=='A'){
            System.out.println("Amsterdam");}
        else if(inputChar=='B'){
            System.out.println("Berlin");}
        else if(inputChar=='C'){
            System.out.println("Columbo");
        }
        else if(inputChar=='D'){
            System.out.println("Dublin");
        }
        else if(inputChar=='E'){
            System.out.println("Edinburgh");}
        else if(inputChar=='F'){
            System.out.println("Florence");
        }
        else{
            System.out.println("Invalid entry");
        }
        obj.close();
    }
}
