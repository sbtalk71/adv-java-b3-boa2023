package lamdba.ex1;

@FunctionalInterface
public interface Calculator {

	public double doMath(int a, int b);
}

class Main2{
	public static void main(String[] args) {
		//write 4 implementations of doMath for add, subtract, multiply an divide
		
		Calculator add=(a,b)->a+b;
		Calculator subtract=(a,b)->a-b;
		Calculator multiply=(a,b)->a*b;
		Calculator divide=(a,b)->a/b;
	}
}
