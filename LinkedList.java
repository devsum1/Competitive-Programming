package test;

class LinkedList {
	static Node head;
	static int size;
	static int length = 0;

    static class Node{
    	int data;
    	Node next;
    	
    	
    	Node(int d){
    		data = d;
    		next = null;
    		size++;
    	}
    }
    
    public static void print() {
    	 Node n = head;
  	     while(n != null) {
  		   System.out.print(n.data+" ");
  		   n = n.next;
  	   }	
  	 System.out.println();   
    }
    
    public static void insert(int data,int pos) {
    	System.out.println();
    	System.out.println("Inserting " +data +" at " +pos+ ".");
    	Node m = new Node(data);
    	if(pos == 1) {
    		m.next = head;
    		head = m;
    		
    	}else if(pos == size+1){
    		if(size == 0) {
    			head.next = m;
    		}
    		
    		 Node n = head;
     	     while(n != null) {
     		   n = n.next;
     	   }	
     	     n.next = m;
     	     m.next = null;
    	}else {
    		Node n = head;
    		for(int i = 1;i<pos-1;i++)
    			n = n.next;
    		
    		m.next = n.next;
    		n.next = m;
    	}
    	
    }
    
    public static int length(Node head) {
    	if(head == null) {
    		return length;
    	}
    	else
    		return length=1+length(head.next);
 
    }
    
    public static void delete(int item) {
    	Node temp = head;
    	Node prev = null;
    	if(temp.data == item) {
    		head = temp.next;
    		return;
    	}
    	while(temp != null && temp.data != item) {
    		  prev = temp;
    		  temp = temp.next;
    	}
    	if(temp == null) 
    		System.out.println("No Element Found");
    	else
    		System.out.println("\nAfter deleting "+item);
    	prev.next = temp.next;
    }
    
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(3);
		
		Node first = new Node(1);
		Node Second = new Node(2);
     
		ll.head.next = first;
		
		first.data = 12;
		first.next = Second;
		
		Second.data = 7;
		Second.next = null;
	    print();
		insert(18,1);
		print();
		insert(19,4);
		print();
		insert(20,2);
		print();
		insert(12,1);
		print();
		delete(20);
		delete(12);
		delete(7);
		print();
		System.out.println(length(head));
		
	}

}
