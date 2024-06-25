package d01;

public class Ex11나누기메소드_return에삼항연산자 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : "+result);
		
		
		
		
		
	}

	
	
	public static boolean isDivide(int num1, int num2) {
//		boolean result=false;
//		if(num1%num2==0) {
//			result=true;
//		}
//		
//		return result;
		
		return num1%num2==0? true: false;    //return에 바로 삼항ㄱㄱ
	}
	
	
	
	
	
	
}
