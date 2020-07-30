package calcengine;

public class Multiply extends CalAbstract{
	
	Multiply(){}
	
	Multiply(int leftVal,int rightVal){
		super(leftVal,rightVal);
	}
	
	

	@Override
	public void calculating() {
		// TODO Auto-generated method stub
		
		result=leftVal*rightVal;
		
	}

}
