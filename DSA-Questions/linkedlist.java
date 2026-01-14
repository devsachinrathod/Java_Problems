
// //     int val;
// //     Node next;
    
// //     Node(int val) {
// //         this.val = val;
// //         this.next = null;
// //     }
// // }
// // class linkedlist{
	
// // 	Node head;
// //     int size;
// // 	public int insertAtbigning(int val) {
// // 		Node newNode = new Node(val);
// // 		newNode.next = head;
// // 		head = newNode;
// //         return val;
		
// // 	}
// // 	public void insertAtending(int val) {
// // 		if(head == null) {
// // 			insertAtbigning(val);
// // 			return;
// // 		}
// // 		Node newNode = new Node(val);
// // 		head.next = newNode;
// // 		head = newNode;
// // 		size++;
		
		
	
// // 	}

// //  public int display() {
// // 	 if(head == null) {
// // 		 System.out.println("The linked is empty");
// // 	 }
// // 	 Node current = head;
// // 	 while(current != null) {
// // 		 System.out.print(current.val + "-> ");
// // 		 current = current.next;
// // 	 }
// //      return 0;
// //  }
// //  public static void main(String[] args) {
// // 	 linkedlist l1 = new linkedlist();
	
// //      l1.insertAtending(45);
// //       l1.insertAtbigning(12);
// // 	 l1.insertAtbigning(12);
// // 	 l1.insertAtbigning(12);
// // 	 l1.insertAtbigning(12);
// // 	 l1.display();
// //  }
// // }
// // class Node {
// //    int data;
// // 	 	 Node next;

// // 		 Node(int data) {
// // 			 this.data = data;
// // 			 this.next = null;
// // 		 }	 
// // }



// class Node{
// 	Node next;
// 	int data;
// 	Node(int data){
// 		this.data = data;
// 		this.next = null;
// 	}
// }
// class linkedlist {
//   Node head;
// 	public void insertAtBeginning(int data) {
// 			Node newNode = new Node(data);
// 			newNode.next = head;
// 			head = newNode;
// 	}

// public void insertElementAtBig(int data){
// 	Node newnNode = new Node(data);
// 	newnNode.next = head;
// 	head = newnNode;

// }
// 	public void display(){
// 		Node current = head;
// 		while(current != null) {
// 			System.out.print(current.data + " -> ");
// 			current = current.next;
// 		}
// 	} 

	
// 	public static void main( String[] args){
// 		linkedlist l1 = new linkedlist();
// 		l1.insertAtBeginning(12);
// 		l1.insertAtBeginning(13);
//     l1.insertAtBeginning(19);
// 		l1.display();
// 	}
// }





class Node {
       Node next;
	   int data;
	   
	Node(int val){
	 this.data = val;
	 this.next = null;	
}
}

class linkedlist{
Node head;

    public void insertValue(int val){
					Node newNode = new Node(val);
	  newNode.next = head;
	  head = newNode;
	  
	}
	public void printValue(){
	  Node currentNode = head;
	  while(currentNode != null){
	   System.out.println(currentNode.data);
	   currentNode = currentNode.next;
	  }
	}

	public void insertLast(int val){
		if(head == null){
			insertValue(val);
			return;
		}
		Node newNode = new Node(val);
		Node currentNode = head;
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	public void deleteFirstValue(){
		if(head == null){
		  return;
		}

		head = head.next;
	

		}
	public void deleteLastValue(){
		if(head == null){
			return;
		}
		if(head.next == null){
		  head = null;
		  
		}
		Node currentNode = head;
		while(currentNode.next.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = null;

	}
	
public void deleteMiddleValue(int val){
	if(head == null){
		return;
	}
	if(head.next == null){
		head = null;
		return;
	}
	Node currentNode = head;
	while(currentNode.next != null && currentNode.next.data != val){
		currentNode = currentNode.next;
	
	}
	currentNode.next = currentNode.next.next;

}
public void reverse() {
    Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next;   // store next node
        current.next = prev;   // reverse the link
        prev = current;        // move prev forward
        current = next;        // move current forward
    }
		   head = prev; // update head to last node
}



		public static void main( String[] args){
		
   linkedlist l1 = new linkedlist();
   l1.insertValue(12);
   l1.insertValue(13);
   l1.insertValue(14);
	
  //  l1.printValue();
	//  l1.deleteFirstValue();
	//  System.out.println("After deleting first value:");
	//  l1.printValue();

	//  l1.deleteLastValue();
	//  System.out.println("After deleting last value:");
	//  l1.printValue();
	//  l1.deleteMiddleValue(13);
	//  System.out.println("After deleting middle value:");
	//  l1.printValue();
  	System.out.println("Display in reverse order:");
	l1.reverse();
	

	}
}
	