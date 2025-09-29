public class Find_pair {

    // Binary search method
    static int binarySearch(int[] nums, int target, int start) {
        int low = start, hi = nums.length - 1;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Find pair that sums to target
    static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // What number completes the pair?
            int index = binarySearch(nums, complement, i + 1); // Search in right side only
            if (index != -1) {
                System.out.println("Pair found: " + nums[i] + " + " + nums[index] + " = " + target);
                return;
            }
        }
        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 13;
        findPair(arr, target);
    }
}
