package collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleListDemo {

	public static void main(String[] args) {
		
		//Set<String>  fruits=new HashSet<String>();
		SortedSet<String> fruits=new TreeSet<String>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("guava");
		fruits.add("pear");
		fruits.add("avocado");
		fruits.add("grapes");
		fruits.add("guava");
		
		System.out.println(fruits);
		
		System.out.println("No of elements : "+fruits.size());
		System.out.println("Is the Set Empty : "+fruits.isEmpty());
		System.out.println("Does it contain Lichi?"+fruits.contains("lichi"));
		System.out.println(fruits.add("lichi"));
		fruits.remove("avocado");
		System.out.println(fruits);
		
		Iterator<String> itr=fruits.iterator();
		
		while(itr.hasNext()) {
			String fruit=itr.next();
			System.out.println(fruit);
		}
		
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
		
		fruits.clear();
		
		System.out.println(fruits);

	}

}
