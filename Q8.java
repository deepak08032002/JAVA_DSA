public class Q8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 12, 15 };
        int l = 0;
        int h = arr.length - 1;
        int k = 10;
        System.out.println("Find floor and ceil of " + k);
        int res = 0;
        // floor
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < k) {
                res = arr[mid];
                l = mid + 1;

            } else {
                h = mid - 1;
            }
        }
        System.out.println("Floor is" + res);
        // ceil
        res = 0;
        l = 0;
        h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > k) {
                res = arr[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("Ceil is " + res);
    }

}
