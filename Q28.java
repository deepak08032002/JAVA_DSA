import java.util.ArrayList;

public class Q28 {
    public static void main(String[] args) {
        int i = 0;q29.java
        
        int j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;
        while (j < n) {
            sum += arr[j];
            if (sum < s) {
                j++;
            } else if (sum == s) {
                list.add(i);
                list.add(j);
                break;
            } else if (sum > s) {
                while (sum > s) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(list);
    }
}