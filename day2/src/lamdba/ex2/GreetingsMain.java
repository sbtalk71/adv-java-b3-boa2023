package lamdba.ex2;

public class GreetingsMain {

	public static void main(String[] args) {
		GreetService gs= new GreetService();

//Use Lambda expression for greet to print four
		//different greetings
		
				gs.showGreeting(()->"Good Morning");
				gs.showGreeting(()->"Good Evening");
				gs.showGreeting(()->"Good Night");
				gs.showGreeting(()->"Good Day");
	}

}
