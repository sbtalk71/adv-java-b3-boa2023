package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,3,35,6,45,8,23,5,4,90);
		
		//Print all the even numbers
		numList.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		//Print all odd numbers
		numList.stream().filter(x->x%2!=0).forEach(System.out::println);
		
		//find the max value
		int maxValue=numList.stream().map(x->x.intValue()).max((x,y)->{System.out.println(x+","+y);return x.compareTo(y);}).get();
		
		System.out.println(maxValue);
		//calculate the sum of all integers
		System.out.println(numList.stream().mapToInt(x->x.intValue()).sum());
		
		System.out.println(numList.stream().reduce((x,y)->x+y).get());
		//long sum=numList.stream().map(n->n.intValue())
		//add all odd numbers
		//add all even numbers
		//add 10 to every even number and collect in another List
		
		 numList.stream().filter(x->x%2==0).map(x->x+10).collect(Collectors.toList()).forEach(System.out::println);
		 
		 
		
		

	}

}
