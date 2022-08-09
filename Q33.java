import java.util.PriorityQueue;

public class Q33 {
    public static void main(String[] args) {
        // kth smallest element in the array
        int[] arr = { 7, 10, 4, 3, 20, 15 };

        int k = 3;
        // k+smallest = max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // this is how priority queue is declared
                                                                               // in java
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());
    }
}
