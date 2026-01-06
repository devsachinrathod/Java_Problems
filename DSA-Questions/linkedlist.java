// class Node {
//     int val;
//     Node next;
    
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
// class linkedlist{
	
// 	Node head;
//     int size;
// 	public int insertAtbigning(int val) {
// 		Node newNode = new Node(val);
// 		newNode.next = head;
// 		head = newNode;
//         return val;
		
// 	}
// 	public void insertAtending(int val) {
// 		if(head == null) {
// 			insertAtbigning(val);
// 			return;
// 		}
// 		Node newNode = new Node(val);
// 		head.next = newNode;
// 		head = newNode;
// 		size++;
		
		
	
// 	}

//  public int display() {
// 	 if(head == null) {
// 		 System.out.println("The linked is empty");
// 	 }
// 	 Node current = head;
// 	 while(current != null) {
// 		 System.out.print(current.val + "-> ");
// 		 current = current.next;
// 	 }
//      return 0;
//  }
//  public static void main(String[] args) {
// 	 linkedlist l1 = new linkedlist();
	
//      l1.insertAtending(45);
//       l1.insertAtbigning(12);
// 	 l1.insertAtbigning(12);
// 	 l1.insertAtbigning(12);
// 	 l1.insertAtbigning(12);
// 	 l1.display();
//  }
// }
// class Node {
//    int data;
// 	 	 Node next;

// 		 Node(int data) {
// 			 this.data = data;
// 			 this.next = null;
// 		 }	 
// }



class Node{
	Node next;
	int data;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class linkedlist {
  Node head;
	public void insertAtBeginning(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
	}

public void insertElementAtBig(int data){
	Node newnNode = new Node(data);
	newnNode.next = head;
	head = newnNode;

}
	public void display(){
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	} 
	public static void main( String[] args){
		linkedlist l1 = new linkedlist();
		l1.insertAtBeginning(12);
		l1.insertAtBeginning(13);
    l1.insertAtBeginning(19);
		l1.display();
	
	}
}