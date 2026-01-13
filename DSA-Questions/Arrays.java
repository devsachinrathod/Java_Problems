class ArraysCall{
  int arr[];

  public ArraysCall(int size){
    arr = new int[size];
  }

  public void insert(int index, int val){
    
    if(index >= 0 && index < arr.length){
      arr[index] = val;
    } else {
      System.out.println("Index out of bounds");
  }
}
public void display(){
  for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
  }
  System.out.println("value inserted");
}
}
// //    Node next;
class Arrays {
  public static void main(String args[]){
    ArraysCall array = new ArraysCall(5);
    array.insert(0, 10);
    array.insert(1, 20);
    array.insert(2, 30);
    array.insert(3, 9); // This will print "Index out of bounds"
    array.display();
 // This will print "Index out of bounds"
  }
}