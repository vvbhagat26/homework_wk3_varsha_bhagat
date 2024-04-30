package homework_week3;

import java.util.Scanner;

public class Prog5_HRASalary {
    public static void display(int id,String name,double bSalary){
        double hra=(10*bSalary)/100;
        double da=(8*bSalary)/100;
        double ta=(9*bSalary)/100;
        double pf=(20*bSalary)/100;
        double gSal=(bSalary+hra+ta+da-pf);
        System.out.println("'' +----------------------------------+''");
        System.out.println("''|        Salary  slip               |''");
        System.out.println("''|+--------------------------------+ |''");
        System.out.println("  |Employee Id: "            + id +"  |"  );
        System.out.println("  |Employee name:"             +name+"|"  );
        System.out.println("''|+--------------------------------+ |''");
        System.out.println("  | Basic salary:"      +bSalary+     "|");
        System.out.println("  |      HRA 10%:"        +hra+        "|");
        System.out.println("  |       TA 8%:"          +ta+        "|");
        System.out.println("  |       DA 9%:"          +da+        "|");
        System.out.println("  |       PF  20%"         +pf+        "|");
        System.out.println("''| +--------------------------------+ |''");
        System.out.println("  | Gross salary:"        + gSal+      "|" );
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter name");
        String name = obj.nextLine();
        System.out.println("enter emp id");
        int id= obj.nextInt();
        System.out.println("enter basic salary");
        double bSalary= obj.nextDouble();
        display(id,name,bSalary);
        obj.close();
    }
}
