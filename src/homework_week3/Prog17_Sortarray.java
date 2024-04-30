package homework_week3;

import java.util.Arrays;

public class Prog17_Sortarray {
    public static void main(String[] args) {
        int a[]={9,8,7,6};
        String s[]={"x","u","k","a"};
        Arrays.sort(a);
        System.out.println("Sorted numeric array (ascending): " + Arrays.toString(a));
        Arrays.sort(s);
        System.out.println("Sorted string array (alphabetical order): " + Arrays.toString(s));
    }
}
