public class Q15 {
    public static void main(String[] args) {
        // Largest sub-array of sum k
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int i = 0;
        int j = 0;
        int sum = 0;
        int k = 5;
        int max = 0;
        int size = arr.length;
        while (j < size) {
            sum += arr[j];
            if (sum < k) {
                j++;
            } else if (sum == k) {
                max = Math.max(j - i + 1, max);
                j++;
            } else if (sum > k) {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                }
                j++;// As sum<k so we have to move the pointer

            }
        }
        System.out.println(max);
    }

}
