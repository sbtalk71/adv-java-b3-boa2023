package collections.sets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserSetDemo {

	public static void main(String[] args) {
		
		Set<User> usersSet=new HashSet<User>();
		
		usersSet.add(new User("user1@gmail.com","Hyderabad","male"));
		usersSet.add(new User("user2@gmail.com","Bangalore","female"));
		usersSet.add(new User("user3@gmail.com","Mumbai","female"));
		usersSet.add(new User("user4@gmail.com","Chennai","male"));
		usersSet.add(new User("user5@gmail.com","Hyderabad","female"));
		usersSet.add(new User("user6@gmail.com","Pune","male"));
		usersSet.add(new User("user1@gmail.com","Hyderabad","male"));
		
		System.out.println(usersSet);
		
		// add a prefix " Welcome to Java " to every userId and print them
		//Print all female users
		
		for(User user:usersSet) {
			if(user.getGender().equals("female")) {
				System.out.println(user);
			}
		}
		//add male users to a new List
		List<User> maleList= new ArrayList<User>();
		for(User user:usersSet) {
			if(user.getGender().equals("male")) {
				maleList.add(user);
			}
		}
		
		maleList.sort(new UserSorter());
		
		System.out.println(maleList);

	}

}

class UserSorter implements Comparator<User>{
	@Override
	public int compare(User u1, User u2) {
		
		return u1.getLocation().compareTo(u2.getLocation());
	}
}
