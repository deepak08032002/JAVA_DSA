import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 9, 3, 4, 5 };
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int e : arr) {
            map.put(e, true); // assigning all true
        }
        for (int e : arr) {
            if (map.containsKey(e - 1)) {
                map.put(e, false); // this will left the ones on "true" who are actually start of something
            }
        }
        int len = 1;
        int max = 0;
        for (int e : arr) {
            if (map.get(e) == true) {
                int val = e;
                int le = 1;
                while (map.containsKey(val + 1)) {
                    val += 1;
                    le++;
                }
                max = Math.max(max, le);
            }

        }
        System.out.println(max);
    }
}
