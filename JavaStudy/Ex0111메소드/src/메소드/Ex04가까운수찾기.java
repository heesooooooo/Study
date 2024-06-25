package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num1 = sc.nextInt();
	System.out.print("정수 입력 : ");
	int num2 = sc.nextInt();
	int result = close10(num1, num2);
	System.out.println("10에 가까운 수 : " + result);
	
		
		
	}
	
	private static int close10(int num1, int num2) {
		// ex) 5, 9를 봤을 때 더 10에 가까운 수 -->9
		// 10-5=5 / 10-9=1 ==> 더 작은 쪽이 10에 가깝다고 판별
		// 10-11=-1 / 10-15=-5 ==> 더 작은 쪽이 10에 가깝다고 XXX
		// -1, -5에서 -를 뗄 수 있는 방법 ===> 제곱해주기
	
		// 절대값 : 수직선상 위에서 거리를 나타내는 값
		// 1. 제곱으로 만들어서 판별하는 방법
//		if((10-num1)*(10-num1) > (10-num2)*(10-num2)) {
			// 10에 가까운 수 num2
		// 2. 자바에서 절대값 만들기
		if(Math.abs(10-num1) > Math.abs(10-num2)) {
			return num2;
		} else if(Math.abs(10-num1) < Math.abs(10-num2)) {
			return num1;
		} else {
			return 0;
		}
	
	}
	
	
//	private static int close10(int num1, int num2) {
//		int result=0;
//		if(num1<10 && num2<10) {
//		result= 10-num1>10-num2 ? num2: num1;
//		} else if(num1) {
//			
//		}
//		
//		
//		
//		return result ;
//	}
//	
//	
	
	
	
}
