 class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation count: " + findRotationCount(arr));
    }

    static int findRotationCount(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            // If array is already sorted
            if (arr[start] <= arr[end]) {
                return start; // smallest element found
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            // Check if mid is the smallest element
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Decide whether to go left or right
            if (arr[mid] >= arr[start]) {
                start = mid + 1; // go right
            } else {
                end = mid - 1; // go left
            }
        }
        return -1; // should never happen
    }
}
