import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        // Nearest smaller to left
        int[] arr = { 4, 5, 2, 10, 8 };
        int n = arr.length;
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (s.isEmpty()) {
                list.add(-1);
            } else if (s.size() > 0 && s.peek() < arr[i]) {
                list.add(s.peek());
            } else if (s.size() > 0 && s.peek() >= arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        System.out.println(list);
    }
}
