package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기(main영역 안쪽에서 사용)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);

		System.out.println(subNum(3,7));

		printHello();
		printHello();
		
	}
	
	
	
	
	// 3. "Hello World"를 5번 출력하는 메소드
	public static void printHello() {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
	
	
	
	
	
	
	// 2. 빼기를 수행하는 메소드 생성
	// 리턴 타입 : int / 매개변수 : int 2개 / 메소드명: subNum
	// 매개변수로 받아온 데이터 두개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰수에서 작은 수를 뺀 결과를 돌려주기
	public static int subNum(int num1, int num2) {
		// 삼항연산자
		// 조건식 ? 실행문(조건식이 참일 때) : 실행문2(조건식이 거짓일 때);
		return num1>num2? num1-num2: num2-num1;
		//**int result 안 쓰고 리턴에 바로 해도 됨
	}
	
	
	
	
	
	// 1. 메소드 생성(main 영역 벗어나서 작성하기)
	// 리턴타입 : double / 매개변수 : 2개 double / 메소드 명 : addDouble
	public static double addDouble(double num1, double num2) {
		// 메소드는 return을 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드를 작성할 것!
		double result = num1 + num2;
		return result;
	}
	
	
	
	
	

}
