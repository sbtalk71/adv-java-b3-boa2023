package collections.sets;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleSetDemo {

	public static void main(String[] args) {

		// List<String> fruits=new ArrayList<String>();
		List<String> fruits = new LinkedList<String>();

		fruits.add("apple");
		fruits.add("banana");
		fruits.add("guava");
		fruits.add("pear");
		fruits.add("avocado");
		fruits.add("grapes");
		fruits.add("guava");

		System.out.println(fruits);

		System.out.println("No of elements : " + fruits.size());
		System.out.println("Is the Set Empty : " + fruits.isEmpty());
		System.out.println("Does it contain Lichi?" + fruits.contains("lichi"));
		fruits.add(3, "lichi");
		fruits.remove(4);
		System.out.println(fruits);

		Iterator<String> itr = fruits.iterator();

		while (itr.hasNext()) {
			String fruit = itr.next();
			System.out.println(fruit);
		}

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		fruits.sort(new FruitsSorter());

		System.out.println(fruits);
		
		fruits.clear();

		System.out.println(fruits);

	}

}

class FruitsSorter implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}
}
