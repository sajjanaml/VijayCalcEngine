package calcengine;

public class MainAbstract {

	public static void main(String[] args) {
		
		
		CalAbstract[] obj = {
				new Adder(1,1),
				new Subtract(4,2),
				new Multiply(2,2),
				new Divide(10,2)
		};
		
		for(CalAbstract o :obj) {
			o.calculating();
			System.out.println(o.result);
		}
		
		

	}

}
