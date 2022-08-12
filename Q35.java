import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] nums = { 3, 3, 4 };
        int n = nums.length;
        for (int e : nums) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        for (int e : map.keySet()) {
            if (map.get(e) > (n / 3)) {
                list.add(e);
            }
        }
        System.out.println(list);
    }
}
