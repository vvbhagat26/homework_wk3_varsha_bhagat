package homework_week3;

import java.util.Scanner;

public class Prog7_SalesComission {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name");
        String name = obj.nextLine();
        System.out.println("enter sales id");
        int id = obj.nextInt();
        System.out.println("enter sale amount");
        double sAmt = obj.nextDouble();
        System.out.println("enter salary basic");
        double sB = obj.nextDouble();

        if (sAmt >= 50000) {
            double comi = sAmt * 0.35;
            System.out.println(comi);
        } else if (sAmt >= 30000) {
            double comi = sAmt * 0.20;
            System.out.println(comi);
        } else if (sAmt >= 20000) {
            double comi = sAmt * 0.10;
            System.out.println(comi);
        } else if (sAmt >= 10000) {
            double comi = sAmt * 0.5;
            System.out.println(comi);
        } else if (sAmt < 10000) {
            double comi = sAmt * 0.2;
            System.out.println(comi);
        } else {
            System.out.println("invalid input");
        }
        obj.close();
    }
}
