import java.util.*;

public class Q30 {
    public static void main(String[] args) {
        // Stock Span Problem
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        // here we will use nearest greater to left.So, we will traverse from the right
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {

            if (s.isEmpty()) {
                list.add(1);
            } else if (s.size() > 0 && arr[i] < s.peek()) {
                list.add(1);
            } else if (s.size() > 0 && arr[i] >= s.peek()) {
                while (s.size() > 0 && arr[i] >= s.peek()) {
                    count++;
                    s.pop();
                }
                if (s.isEmpty()) {
                    list.add(1);
                } else {
                    list.add(count);
                }
                count = 1;
            }
            s.push(arr[i]);
        }
        // Collections.reverse(list);
        System.out.println(list);
    }
}
