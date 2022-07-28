public class Q21 {
    public static void main(String[] args) {
        // Maximum average sub-array
        int i = 0;
        int j = 0;
        int sum = 0;
        double max = (double) Integer.MIN_VALUE;
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        int size = arr.length;
        while (j < size) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, ((double) sum / k));
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }

}
