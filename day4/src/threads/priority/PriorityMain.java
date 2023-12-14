package threads.priority;

public class PriorityMain {

	public static void main(String[] args) throws Exception{
		Clicker c1= new Clicker();
		Clicker c2= new Clicker();
		
		Thread hi=new Thread(c1);
		Thread lo=new Thread(c2);
		
		hi.setPriority(Thread.NORM_PRIORITY+2); //7
		lo.setPriority(Thread.NORM_PRIORITY-2);//3
		
		hi.start();
		lo.start();
		
		Thread.sleep(10000);
		
		c1.stop();
		c2.stop();
		
		System.out.println("Hi ran for "+c1.click);
		System.out.println("Lo ran for "+c2.click);
		
		System.out.println("diff is  "+(c1.click-c2.click));
		
		

	}

}
