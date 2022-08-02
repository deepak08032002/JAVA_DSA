import java.util.*;

public class Q26 {
    public static void main(String[] args) {
        // Nearest Greater to right
        // In this we traverse the array from the end
        int[] arr = { 1, 3, 2, 4 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (list.size() == 0) {
                list.add(-1);
            } else if (list.size() > 0 && s.peek() > arr[i]) {
                list.add(s.peek());
            } else if (list.size() > 0 && s.peek() <= arr[i]) {
                while (list.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (list.size() == 0) {
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
