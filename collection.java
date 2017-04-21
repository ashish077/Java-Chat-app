package practice;

import java.util.HashSet;
import java.util.Iterator;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> hs=new HashSet<>();
	hs.add("india");
	hs.add("america");
	hs.add("japan");
	hs.add("china");
	//view in hashset
	System.out.println("hash set ="+ hs);
	//add an iterator in hs 
	Iterator<String> it=hs.iterator();
	//display elements 
	System.out.println("elements using iterator: ");
	while(it.hasNext())
	{
		
		String s=(String)it.next();
		System.out.println(s);
		
	}
		
	
	}

}
