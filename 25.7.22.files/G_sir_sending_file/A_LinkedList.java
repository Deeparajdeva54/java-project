package collectionObj1;

import java.util.Iterator;
import java.util.LinkedList;

public class A_LinkedList {
	
	
	
	

	public static void main(String[] args) {
		
		LinkedList MyLinkedList = new LinkedList();
		
		MyLinkedList.add("Loin");
		MyLinkedList.add("Cat ");
		MyLinkedList.add("Tiger ");
		MyLinkedList.add("Dog ");
		MyLinkedList.add("Elephant ");
		MyLinkedList.add("Zebra ");
		MyLinkedList.add("Deer ");
		MyLinkedList.add("Fox ");
		
		Iterator iterator = MyLinkedList.iterator();
		
		
		
		for(int i = 0; iterator.hasNext(); i++ ) {
			
			System.out.println(iterator.next());
		}
		
		
		

	}

}
