//Search element in Sorted Array
public class Q7 {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int k = 12;
        int l = 0;
        int h = arr.length - 1;
        // first we have to find the minimum element
        int min = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                min = arr[mid];
                break;
            } else if (arr[mid] > arr[0]) {
                l = mid;
            } else {
                h = mid;
            }
        }
        System.out.println("Min" + min);
        // not we can divide the array in two parts
        // one from starting to just before minimum number , it will be sorted array and
        // rest will be from mini to last.
        int start = Bsa(k, 0, min - 1, arr);
        int last = Bsa(k, min, arr.length - 1, arr);
        if (start > 0) {
            System.out.println("present at" + start);
        }
        if (last > 0) {
            System.out.println("present " + last);
        }
    }

    public static int Bsa(int k, int i, int j, int[] arr) {
        int l = i;
        int h = j;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;// in case doesn't found

    }

}
