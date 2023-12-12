package innerclasses;

public interface MathConstants {

	public double getPiValue();
}

class MathConstantsImpl implements MathConstants{
	@Override
	public double getPiValue() {
		
		return 3.414;
	}
}

class Main{
	public static void main(String[] args) {
		MathConstants mc=new MathConstantsImpl();
		System.out.println(mc.getPiValue());
		
		
		MathConstants mc1 =new MathConstants() {
			@Override
			public double getPiValue() {
				
				return 3.414;
			}
		};
		
		System.out.println(mc1.getPiValue());
		
		MathConstants mc2=()->3.414;
	}
}