package Day22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionsPart3 {

	public static void main(String[] args) {
	
		// Collections is an Interface 
		// List is a Interface 
		// Linked List is a class	 
		// ArrayList is a Class 
		
		// Duplicates are alowed 
		// Insertion order is maintained 
		
		
		// Set is Interface 
		// HashSet is a class
		// LinkedHashSet is a class 
		
		
		//  Why set ?? -- It will not allow u duplicates 
		
		// Duplicates are evicted 
		// Insertion order is not maintained 
		
		// HashSet is a class
		
		HashSet<String> cources = new HashSet<String>();
		
		cources.add("Java") ;
		cources.add("Python") ;
		cources.add("SQL");
		cources.add("Data Science") ;
		cources.add("Java");
		
		for(String s : cources)
		{
			System.out.println(s);
		}
		
		LinkedHashSet<String> Subjects = new LinkedHashSet<String>();
		
		// Data structure concept Hash Table which will speed up the process 
		//  Insertion order is maintained 
		// DUplicates are evicted 
		//  Set and get methods are not available in set 
		
		Subjects.add("Physics") ;
		Subjects.add("Chemistry");
		Subjects.add("Botany");
		Subjects.add("Zoology");
		Subjects.add("Mathematics");
		Subjects.add("Physics");
		
		System.out.println("***********");
		
		for(String s : Subjects)
		{
			System.out.println(s);
		}
		
		
		// Iterator - One by One 
		
		System.out.println("********************************");
		
		
		Iterator<String> i = Subjects.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
