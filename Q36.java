import java.util.*;

public class Q36 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        int n = arr.length;
        if ((findsum(arr, n)) == true) {
            System.out.println("Present ");
        } else {
            System.out.println("Not present");
        }
    }

    static boolean findsum(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                return true;
            } else {
                if (map.containsKey(sum)) {
                    return true;
                } else {
                    map.put(sum, i);
                }
            }
        }
        return false;
    }

}
