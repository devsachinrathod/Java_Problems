import java.util.*;

class FindSimilarElement {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 12, 12, 33, 13, 33};
        Arrays.sort(arr);
        int len = arr.length;
        int f = 33; // element to search

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 🔍 Binary search for element
        int index = Arrays.binarySearch(arr, f);
        if (index >= 0) {
            System.out.println(f + " found at index " + index);
            long count = Arrays.stream(arr).filter(x -> x == f).count();
            System.out.println("Duplicate count of " + f + ": " + count);
        } else {
            System.out.println(f + " not found");
        }

        // 🧮 Find all duplicate elements
        int countDuplicate = 0;
        ArrayList<Integer> dup = new ArrayList<>();

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                countDuplicate++;
                if (!dup.contains(arr[i])) dup.add(arr[i]);
            }
        }

        System.out.println("Total duplicate pairs: " + countDuplicate);
        System.out.println("Duplicate elements: " + dup);
    }
}
