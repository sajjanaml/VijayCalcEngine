package calcengine;

public abstract class CalAbstract {
	
	int leftVal,rightVal;
	int result;
	char opcode;
	
	CalAbstract(){};
	
	CalAbstract(int leftVal,int rightVal){
		this.leftVal=leftVal;
		this.rightVal=rightVal;
	}
	
	public abstract void calculating();
	
	
	
	

	

}
