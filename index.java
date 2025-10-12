//  public Student(int age, String s) {
// 	super();
// 	this.age = age;
// 	this.s = s;
//  }
//  public void registerCourse() {
// 	 if(age< 18) {
// 		 throw new UnderAgeException(s+ "your age under can't entroll 18");
// 	 }
// 	 else
// 	 {
// 		 System.out.println(s+ "sucessfully enrolled");
// 	 }

//  }
//  public static void main(String[] args) {
// 	 Student s1 = new Student(23, "ravi");
// 	 Student s2 = new Student(12, "sachin");
// 	 s1.registerCourse();
// //	 s2.registerCourse(); 
// 	 try {
// 		 s2.registerCourse(); 
// 	 }
// 	 catch(UnderAgeException e) {
// 		 System.out.println(e.getMessage());
// 	 }
//  }
abstract class AnimalDemo {

    // abstract method (no body)
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Sleeping...");
    }

    static void arrayBinarySearch(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        // binary search requires a sorted array; sort a copy to preserve the original array
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return;
    }
    public static void main(String[] args) {
        AnimalDemo a = new AnimalDemo() {
            @Override
            void sound() {
                System.out.println("Animal makes a sound");
            }
        };
// Sleeping...
        arrayBinarySearch(new int[]{5, 3, 8, 1}, 8);
    }

}
