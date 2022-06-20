/**
 * Q1
 */
public class Q1 {

    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String str1, String str2) {

        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char c2 = str2.charAt(i);

            if (map.containsKey(c2) && map.get(c2) > 0) {

                map.put(c2, map.get(c2) - 1);

            } else {
                return false;
            }
        }
        if (map.size() == 0) {
            return false;
        }
        return true;

    }

}