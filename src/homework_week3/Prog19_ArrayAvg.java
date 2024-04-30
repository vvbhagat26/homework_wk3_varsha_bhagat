package homework_week3;

public class Prog19_ArrayAvg {
    public static void main(String[] args) {
        System.out.println("Avg is "+ avg());
    }
    public static double avg() {
        int a[] = {2, 4, 6, 8};
        double sum = 0;
        double avg=0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
             avg = sum / a.length;}
            return avg;
    }
}
