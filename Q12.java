public class Q12 {
    public static void main(String[] args) {
        // Search Insert postiton LEETCODE
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int res = 0;
        if (target < nums[0]) {
            res = 0;
        }
        // if present in array
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                System.out.println(i);
            }
        }

        // if not present in array
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] < target) {
                res = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        System.out.println(res + 1);
    }

}
