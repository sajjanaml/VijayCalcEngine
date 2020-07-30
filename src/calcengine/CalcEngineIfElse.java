package calcengine;

import javax.lang.model.element.Element;

public class CalcEngineIfElse {
	public static void main(String[] args) {
		int[] a= {2,4,6,8};
		int[] b = new int[4];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		char[] opcode= {'a','s','d','m'};
		int[] result = new int[opcode.length];
		
		// opcode a then code should add
		// opcode s then code should add
		// opcode d then code should add
		// opcode m then code should add
		
		//element charchar
		
		for(int i=0;i<opcode.length;i++) {
			switch (opcode[i]) {
			case 'a':
				result[i]= a[i]+b[i];
				
				break;
			case 's':
				result[i]= a[i]-b[i];
				break;
			case 'd':
				result[i]= b[i]==0?0:a[i]/b[i];
				break;
			case 'm':
				result[i]= a[i]*b[i];
				break;

			default:
				result[i]=0;
				System.out.println("Invalid: Opcode");
				break;
			}
		}
		
		for(int res:result) {
			System.out.println(res);
		}
		
		
		
		
		
		
		
	}

}
