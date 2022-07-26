public class Q18_ {
    public static void main(String[] args) {
        // Print all Palindrome substring
        String s = "abcc";

        String snew = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if (isPalindrome(ss) == true) {
                    System.out.println(ss);
                    ;
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        char curr = str.charAt(i);
        char prev = str.charAt(j);
        while (i <= j) {
            if (curr != prev) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

}
