package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {

		//1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		//2. 정수를 입력하세요. 출력하기 (개행없이)
		System.out.print("정수를 입력하세요>> ");
		//3. 정수 입력받기
		int num = sc.nextInt();
		//4. 입력받은 정수가 짝수인지 홀수인지 확인하기
		String result = num%2 == 1 ? "홀수" : "짝수";
		//5. 결과 출력하기
		System.out.println(num + "은(는)" + result + "입니다");
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		int num2 = 2 * 정수ㅡㅡ ;
//		
//		String result = num1 == num2 ? "num1 는(은)짝수입니다." : "num1는(은)홀수입니다." ;
//		System.out.println(result);
//		
		
		
		
		
		
		
		
		
		
	}

}
