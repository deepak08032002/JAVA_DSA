public class Q17 {
    public static void main(String[] args) {
        // Two Sum II - Input Array Is Sorted LEETCODE
        int[] arr = { 2, 7, 15, 19 };
        int target = 9;
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        int[] res = new int[2];
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum == target) {
                res[0] = i;
                res[1] = j;
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        for (int ee : res) {
            System.out.println(ee);
        }
    }

}
