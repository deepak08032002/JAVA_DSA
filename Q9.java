public class Q9 {
    public static void main(String[] args) {
        // if in the array element is already present , return that element else, if
        // not, return the element which will have minimum difference.
        int[] arr = { 1, 2, 4, 5, 10, 15 };
        int k = 12;
        int l = 0;
        int h = arr.length - 1;
        int res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            // if(k==arr[mid]){
            // res=mid;
            // }else
            if (k > arr[mid]) {
                res = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        System.out.println("floor is" + res);
        int floor = arr[res];
        int ceil = arr[res + 1];
        int diff = Math.abs(floor - k);
        int diff1 = Math.abs(ceil - k);
        if (diff < diff1) {
            System.out.println("ans = " + floor);
        } else {
            System.out.println("ans = " + ceil);
        }
    }
}
