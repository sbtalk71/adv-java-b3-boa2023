package streams;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreatorsMain {

	public static void main(String[] args) {
		//Stream<Integer> numStream= Stream.of(1,2,3,4,5,6);
		
		Stream<Integer> numStream= Stream.generate(()->new Random().nextInt(20)).limit(50);
		
		numStream.map(n->n+10).peek(System.out::println).collect(Collectors.toList());

	}

}
