import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        // Valid Anagram
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t) == true) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        if (map.size() != 0) {
            return false;
        }
        return true;
    }
}
