package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<String> namesList=Arrays.asList("Ranga","Kirti","shantanu","Srinivas","shankerlal","Rajeev","Shakuntala");
		
		//display all the names with more than 7 chars long
		namesList.stream().filter(s->s.length()>7).forEach(System.out::println);
		//print the length of each name
		namesList.stream().mapToInt(s->s.length()).forEach(System.out::println);
		//calculate the sum of the length of all the names using reduce(..)
		System.out.println(namesList.stream().mapToInt(s->s.length()).sum());
		// add Welcome to each name and display
		namesList.stream().map(s->"welcome "+s).forEach(System.out::println);
		//find the name with max length
		int maxLenth=namesList.stream().mapToInt(s->s.length()).max().getAsInt();
		namesList.stream().filter(s->s.length()==maxLenth).forEach(System.out::println);
		// find the first name in the list
		System.out.println(namesList.stream().findFirst().get());
		//find the last name in the list
		System.out.println(namesList.stream().reduce((s1, s2)->s2).get());
	}
}
