package streams;

import java.util.Arrays;
import java.util.List;

public class StreamWIthFlatMap {

	public static void main(String[] args) {
		
		List<List<Integer>> data=Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(3,4,5),
				Arrays.asList(6,7),
				Arrays.asList(8,9));
		
		data.stream().flatMap(list->list.stream()).forEach(System.out::println);
		

	}

}
