//Max Min in array
public class Q5 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 56, 65, 0 };
        int max = 0;
        int min = arr[0];
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
            if (e < min) {
                min = e;
            }
        }
        System.out.println("Max is" + max);
        System.out.println("Min is" + min);

    }
}
