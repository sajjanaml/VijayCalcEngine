package calcengine;

public class Subtract extends CalAbstract {
	
	Subtract(){}
	
	Subtract(int leftVal,int rightVal){
		super(leftVal,rightVal);
	}

	@Override
	public void calculating() {
		// TODO Auto-generated method stub
		result=leftVal-rightVal;
		
	}

}
