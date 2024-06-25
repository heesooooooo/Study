package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 출력하기(개행없이)
		System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int num1 = sc.nextInt();
		// 4. 백의자리 이하를 버리기
		int result = num1 - num1 % 100; 
		// 5. 결과값 출력하기
		System.out.println("결과 값 : " + result);
		
		
		// 다른 방법
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result2 = num2 / 100 *100;
		System.out.println("결과 값: " + result2);
		
		
		
		
		
		//내가 푼 거..
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("정수입력 : ");	
//		int num1 = sc.nextInt();
//		
//		
//		System.out.print("결과 값 : " + num1/100 + "00");
		
		
		
		
		
		
	}

}
