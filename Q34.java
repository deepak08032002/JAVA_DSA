import java.util.PriorityQueue;
import java.util.*;

public class Q34 {
    public static void main(String[] args) {
        // K closet number
        // Given an unsorted array and two numbers x and k, find k closest values to x.
        // Input : arr[] = {10, 2, 14, 4, 7, 6}, x = 5, k = 3 .
        int[] arr = { 10, 2, 14, 4, 7, 6 };
        int x = 5;
        int k = 3;
        // We will use maxHeap
        // PriorityQueue<Pair<Integer,Integer>> que=new
        // PriorityQueue<Pair<Integer,Integer>>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(Math.abs(arr[i] - x));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        while (maxHeap.size() > 0) {
            int a = maxHeap.peek() + x;
            maxHeap.poll();
            System.out.println(a);
            // System.out.println(maxHeap.peek());
        }

    }
}
