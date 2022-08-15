import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        // Print 1 to n using recursion
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n);
        System.out.println(n);

    }
}
