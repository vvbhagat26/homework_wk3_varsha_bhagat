package homework_week3;

import java.util.Scanner;

public class Prog16_ZeroPosNeg {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        double num=obj.nextDouble();
        if(num<0.0){
            System.out.println("negative number");
        }else if(num>0){
            System.out.println("positive number");
        }else{
            System.out.println("number is zero");
        }

    }
}
