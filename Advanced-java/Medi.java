
class Medi {

    int st;
    int end;
    int[] nums;
    int target;

    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        st = 0;
        end = nums.length - 1;
        return binarySearch();
    }

    private int binarySearch() {
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    void DisplayData() {
        System.out.println("Search completed");
    }

    public static void main(String[] args) {
        Medi m1 = new Medi();

        int[] nums = {1, 2, 3, 4, 5};
        int result = m1.search(nums, 3);   // initialize st & end
        System.out.println("Index found: " + result);
        m1.DisplayData();
    }
}
