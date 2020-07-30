package calcengine;

public class Divide extends CalAbstract {
	
	Divide(){}
	
	Divide(int leftVal,int rightVal){
		super(leftVal,rightVal);
	}

	@Override
	public void calculating() {
		// TODO Auto-generated method stub
		result=rightVal!=0?leftVal/rightVal:0;
		
		
	}

}
