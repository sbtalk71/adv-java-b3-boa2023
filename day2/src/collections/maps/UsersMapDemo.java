package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import collections.sets.User;

public class UsersMapDemo {

	public static void main(String[] args) {
		Map<Integer, User> userMap=new HashMap<Integer, User>();
		userMap.put(1, new User("user1@gmail.com","Hyderabad","male"));
		userMap.put(2, new User("user2@gmail.com","Pune","male"));
		userMap.put(3, new User("user3@gmail.com","Bangalore","male"));
		userMap.put(4, new User("user4@gmail.com","Mumbai","male"));
		userMap.put(5, new User("user5@gmail.com","Noida","male"));
		userMap.put(6, new User("user6@gmail.com","Hyderabad","male"));
		
		Set<Integer> keys=userMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(userMap.get(key).getUserId());
		}

	}

}
