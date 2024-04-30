package homework_week3;

public class Prog11_Divby3or5 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");
        printDivisibleBy3();
        System.out.println("\nNumbers divisible by 5:");
        printDivisibleBy5();
    }
    public static void printDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void printDivisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
