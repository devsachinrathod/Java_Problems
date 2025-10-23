import java.util.*;

class FindSimilarElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 4, 2, 4, 3, 4};
        int len = arr.length;

        ArrayList<Integer> dup = new ArrayList<Integer>();

        // Sort first so similar elements come together
        Arrays.sort(arr);

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {  // ✅ use == instead of ===
                if (!dup.contains(arr[i])) { // avoid duplicates in dup list
                    dup.add(arr[i]);
                }
            }
        }

        System.out.println("Duplicate elements: " + dup);
    }
}
