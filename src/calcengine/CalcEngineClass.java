package calcengine;

public class CalcEngineClass {
	int leftVal;
	int rightVal;
	int result;
	char opcode;
	
	
	CalcEngineClass(int leftVal,int rightVal,char opcode){
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		this.opcode=opcode;
		
	}
	
	
	
	CalcEngineClass(){}
	
	public void calculate() {
		
			switch (opcode) {
			case 'a':
				result= leftVal+rightVal;
				
				break;
			case 's':
				result= leftVal-rightVal;
				break;
			case 'd':
				result= rightVal==0?0:leftVal/rightVal;
				break;
			case 'm':
				result= leftVal*rightVal;
				break;

			default:
				result=0;
				System.out.println("Invalid: Opcode");
				break;
			
	}

	}
}
   