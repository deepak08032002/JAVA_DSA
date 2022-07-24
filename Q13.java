public class Q13 {
    public static void main(String[] args) {
        // Squares of a sorted array
        int[] nums = { -4, -1, 0, 3, 10 };
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int e : nums) {
            System.out.println(e);
        }
    }

}
