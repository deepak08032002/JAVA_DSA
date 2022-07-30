import java.util.ArrayList;

public class Q23 {
    public static void main(String[] args) {
        // Return elements who are perfect squares.
        int[] arr = { 2, 5, 25, 81, 19, 55, 144 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int e : arr) {
            for (int i = 0; i <= e / 2; i++) {
                if (Math.pow(i, 2) == e) {
                    list.add(e);
                }
            }
        }
        System.out.println(list);
    }

}
