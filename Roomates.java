public class Roomates {

    // Binary Search method
    static int bs(int[] nums, int k) {
        int low = 0, hi = nums.length - 1;

        while (low <= hi) {
            System.out.println("Current range is : " + low + hi);
            int mid = (low + hi) / 2;
            if (nums[mid] == k) {
                return mid; // found
            } else if (nums[mid] > k) {
                hi = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 38;

        int result = bs(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
