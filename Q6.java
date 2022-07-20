//Binary Search in Descending Sorted Array
public class Q6 {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;
        int k = 4;
        int l = 0;
        int h = n - 1;
        int index = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (k == arr[mid]) {
                index = mid;
                break;
            } else if (k < arr[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        System.out.println("Index is " + index);
    }
}
