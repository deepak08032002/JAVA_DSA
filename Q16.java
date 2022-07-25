public class Q16 {
    public static void main(String[] args) {
        // Input = wwwwaaadexxxxxx
        // Output = w4a3dex6
        String s = "wwwwaaadexxxxxx";
        String ans = Character.toString(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                    ans += curr;
                    count = 1;
                } else {
                    ans += curr;
                }

            }
        }
        if (count > 1) {
            ans += count; // for the last count to be added
        }
        System.out.println(ans);
    }

}
