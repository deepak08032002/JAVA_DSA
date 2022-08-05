import java.util.ArrayList;
import java.util.Stack;

public class Q29 {
    public static void main(String[] args) {
        // Nearest Greater to left
        // Traverse from the left
        int[] arr = { 1, 3, 2, 4 };
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()) {
                list.add(-1);
            } else if (s.size() > 0 && s.peek() > arr[i]) {
                list.add(s.peek());
            } else if (s.size() > 0 && arr[i] >= s.peek()) {
                while (s.size() > 0 && arr[i] >= s.peek()) {
                    s.pop();
                }
                if (s.size() == 0) {
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
