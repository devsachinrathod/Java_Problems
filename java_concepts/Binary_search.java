
public class Binary_search {
    // Binary Search method
    static int bs(int[] nums, int k) {
        int low = 0, hi = nums.length - 1;
//    int[] arr = {2, 5, 8, 12, 16, 23, 38};
        while (low <= hi) {  //0 <=38
            System.out.println("Current range is : " + low + hi);
            int mid = (low + hi) / 2;
            //12, 16, 23, 38
            if (nums[mid] == k) {//12 == 38 false
                return mid;
            } else if (nums[mid] > k) {
                hi = mid - 1; 
            } else {
                low = mid + 1;
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
