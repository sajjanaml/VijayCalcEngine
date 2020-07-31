package calcengine;

public class Adder extends CalAbstract {
	
	
	Adder(){
		
	}
	
	Adder(int leftVal,int rightVal){
		super(leftVal,rightVal);
	}

	@Override
	public void calculating() {
		// TODO Auto-generated method stub
		result=leftVal+rightVal;
	}

}
