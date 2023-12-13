package streams;

import java.util.Arrays;
import java.util.List;

public class StreamWithObjects {

	public static void main(String[] args) {
		List<User> usersList=Arrays.asList(
					new User("amit@yahoo.com","Amit","Hyderabad","male"),
					new User("kirti@yahoo.com","Kirti","Noida","female"),
					new User("ranga@gmail.com","Ranga","Bangalore","male"),
					new User("srini@gmail.com","Srinivas","Hyderabad","male"),
					new User("sapna@yahoo.com","Sapna","Pune","female"),
					new User("ruchi@yahoo.com","Ruchira","Hyderabad","female"),
					new User("rony@yahoo.com","Rony","Bangalore","male"),
					new User("tara@gmail.com","Tara","Pune","female"),
					new User("adi@yahoo.com","aditya","Hyderabad","male"),
					new User("shanker@yahoo.com","Shankerlal","Noida","male")
				);
		
		//List all the users from Hyderabad
		//List all the users having yahoo mail
		//collect all the male users in a separate List
		//Sort all the users by name
		//change the location of Ranga to Hyderabad
		
	}

}
