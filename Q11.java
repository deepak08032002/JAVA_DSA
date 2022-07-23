public class Q11 {
    public static void main(String[] args) {
        // Return any Peak Element
        int[] arr = { 5, 10, 20, 15, 12, 60, 50 };
        int l = 0;
        int h = arr.length - 1;
        int res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    res = arr[mid];
                    break;
                } else if (arr[mid] < arr[mid + 1]) {
                    l = mid + 1;
                } else if (arr[mid] < arr[mid - 1]) {
                    h = mid - 1;
                }
            } else if (mid == 0) {
                if (arr[1] < arr[0]) {
                    res = arr[0];
                    break;
                } else {
                    res = arr[mid];
                    break;
                }
            } else if (mid == arr.length - 1) {
                if (arr[arr.length - 2] < arr[arr.length - 1]) {
                    res = arr[arr.length - 1];
                } else {
                    res = arr[arr.length - 2];
                }
            }
        }
        System.out.println(res);
    }
}
