package homework_week3;

public class Prog18_ArraySum {
    public static void main(String[] args) {
        System.out.println("sum of values:" + add());
    }
    public  static int add()
        { int a[] = {2, 3, 4, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];}
            return sum;
        }
     }


