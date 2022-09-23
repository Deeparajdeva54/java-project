package colllection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class First_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    LinkedList Fruitlist=new LinkedList();
	
    Fruitlist.add("apple");
	Fruitlist.add("mango");
	Fruitlist.add("orange");
	Fruitlist.add("papaya");
	
	Iterator it=Fruitlist.iterator();
	
	for(int j=0;it.hasNext();j++)
	{
		System.out.println(it.next());	}
	
	

	}

}
