//Rotate an array
public class Q4 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 2, 9, 8, 1 };
        int n = arr.length;
        int i = 0; // 1st element
        int j = n - 1; // last element
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
