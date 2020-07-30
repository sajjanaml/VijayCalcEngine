package calcengine;

public class MathCalculate {
	
	
	public static CalcEngineClass execute(int leftVal,int rightVal,char opcode) {
		CalcEngineClass obj = new CalcEngineClass();
		obj.leftVal=leftVal;
		obj.rightVal=rightVal;
		obj.opcode=opcode;
		
		return obj;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	CalcEngineClass[] cal = new CalcEngineClass[4];
		
		cal[0] = new CalcEngineClass(4,2,'a');
		cal[1] = new CalcEngineClass(4,2,'s');
		cal[2]=new CalcEngineClass(4,2,'d');
		cal[3]=new CalcEngineClass(4,2,'m');
		
	
	
/*	for(CalcEngineClass c:cal) {
		c.calculate();
		System.out.println(c.result);
	}*/

		for(int i=0;i<cal.length;i++) {
			cal[i].calculate();
			System.out.println(cal[i].result);
		}
		
	}

	
	
}
	
	


		
		
		
	
	
	




	
	
	
	
	
	
	





