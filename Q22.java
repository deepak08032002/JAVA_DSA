import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        // Longest Substring Without Repeating Characters
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        int j = 0;
        int max = 0;
        String s = "abcabcbb";
        while (j < s.length()) {
            char c1 = s.charAt(i);
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {

                map.put(ch, 1);
            }
            if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(c1, map.get(ch) - 1);
                    if (map.get(c1) == 0) {
                        map.remove(c1);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
