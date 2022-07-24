public class Q14 {
    public static void main(String[] args) {
        // sort colours
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int l = 0;
        int mid = 0;
        int h = arr.length - 1;
        while (mid <= h) {
            if (arr[mid] == 0) {
                // swap with arr[l]
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = arr[l];
                l++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[h];
                arr[h] = arr[mid];
                arr[mid] = temp;
                mid++;
                h--;

            }
        }
        for (int e : arr) {
            System.out.println(e);
        }
    }

}
