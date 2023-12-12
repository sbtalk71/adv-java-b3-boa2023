package lamdba.ex3;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main3 {

	public static void main(String[] args) {
		
		Predicate<Integer> p=(s)->s%2==0; 
		
		Consumer<String> c= (s)->System.out.println(s);
		
		Supplier<String> s=()->"Hello world";
		
		Function<String,String> f= (a)->a;
		
		DoubleSupplier d=()->4.5;
		IntSupplier i=()->20;
		IntPredicate x=(y)->true;

	}

}
