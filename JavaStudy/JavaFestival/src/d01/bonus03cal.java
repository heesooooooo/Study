package d01;

public class bonus03cal {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '+';
		
		System.out.println(cal(num1, num2, op));
		
		
		
		
	
	}

	
	public static int cal(int num1, int num2, char op) {
//		int result=0;				// result 쓰지 말고 바로 return
		if(op=='+') {				// return 뒤엔 = 안 씀
//			result=num1+num2;
			return num1+num2;
		}else if(op=='-') {
//			result=num1-num2;		// 뺄셈 음수일 때
			return num1-num2<0 ? num2-num1: num1-num2;
		}else if(op=='*') {
//			result=num1*num2;
			return num1*num2;
		}else if(op=='/') {
//			result=num1/num2;
			return num1/num2;
		}else {
			return 0;				// else return 0
		}
		
	}
	
	
	
}
