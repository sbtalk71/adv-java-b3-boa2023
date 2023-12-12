package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> namesMap=new HashMap<Integer, String>();
		
		namesMap.put(1, "Amit");
		namesMap.put(2, "Ranga");
		namesMap.put(3, "Rahul");
		namesMap.put(4, "Srinivas");
		namesMap.put(5, "Shantanu");
		namesMap.put(6, "Pavan");
		
		System.out.println(namesMap);
		
		System.out.println(namesMap.get(5));
		
		Set<Integer> keySet=namesMap.keySet();
		
		for(Integer key:keySet) {
			
			//System.out.println(key+" ---->"+namesMap.get(key));
			System.out.println("Welcome "+namesMap.get(key));
		}

	}

}
