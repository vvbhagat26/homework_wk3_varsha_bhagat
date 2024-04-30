package homework_week3;

public class Prog20_ArrayContains {
    public static void main(String[] args) {
        int a[]={2,0,8,9,10};
        int targetValue=8;
        boolean containsValue = false;
        // Check if the array contains the target value
        for (int num : a) {
            if (num == targetValue) {
                containsValue = true;
                break;
            }
        }
        if(containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
