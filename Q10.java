public class Q10 {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 4, 9, 4, 7 };
        int k = 3;
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans = Math.max(sum, ans);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
