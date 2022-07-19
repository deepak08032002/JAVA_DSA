//Number of times sorted array is rotated

public class Q3 {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 15, 18, 2, 3, 6, 7 };
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int ans = -1;
        while (h > l) {
            int mid = l + (h - l) / 2;
            if (arr[l] < arr[mid]) {
                l = mid + 1;
            } else if (arr[mid] < arr[h]) {
                h = mid - 1;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                ans = mid;
            }
        }
        System.out.println(ans);
    }

}
