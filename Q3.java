//Number of times sorted array is rotated

public class Q3 {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int l = 0;
        int h = arr.length - 1;
        int r = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                r = mid;
                break;
            } else if (arr[mid] > arr[0]) {
                l = mid;
            } else {
                h = mid;
            }
        }
        System.out.println("Array is rotated by " + r + " times. ");
    }

}
