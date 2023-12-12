package lamdba.ex1;

@FunctionalInterface
public interface MyInterface {

	public double getRandomValue();
	//public double getRandomValue(int a);
	//public int getPiValue();
}

class MyRandom implements MyInterface{
	@Override
	public double getRandomValue() {
		
		return Math.random();
	}
}

class Main{
	public static void main(String[] args) {
		MyInterface mi=()->Math.random();
		
		//(parameter list)-> implementation
		
		MyInterface mi2=new MyRandom();
	}
}