import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        long[] A = { 1, 2, 3 };
        long[] B = { 2, 3, 5 };
        int n = A.length;
        int m = B.length;
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        // HashMap<Long,Integer> map1=new HashMap<Long,Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }

        }
        boolean ans = false;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(B[i])) {
                map.put(B[i], map.get(B[i]) - 1);
                if (map.get(B[i]) == 0) {
                    map.remove(B[i]);
                    ans = true;
                }
            } else {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
