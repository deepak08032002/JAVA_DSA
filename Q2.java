//First and last Occurence of an elemenet in a sorted array.

public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 10, 10, 20 };
        // first occurence
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int k = 10; // element
        int result = 0;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                result = mid;
                h = mid - 1;
            } else if (arr[mid] > k) {
                h = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            }
        }
        System.out.println(result);

        // last occurence
        l = 0;
        h = n - 1;
        result = 0;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                result = mid;
                l = mid + 1;
            } else if (arr[mid] > k) {
                h = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            }
        }
        System.out.println(result);
    }
}
