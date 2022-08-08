import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        // Nearest smalller to left
        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        int n = arr.length;
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>(n); // nearest smaller to left
        // nsr
        for (int i = n - 1; i >= 0; i--) {
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
        Collections.reverse(list);
        System.out.println(list);
    }
}
