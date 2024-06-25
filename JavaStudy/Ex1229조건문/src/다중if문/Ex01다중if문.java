package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {

		// 사용자로부터 점수를 입력받아서 해당하는 숫자가
		// 홀수인지, 짝수인지, 0인지 판다하는 프로그램
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		//2. 숫자를 입력하세요. 출력문 작성
		System.out.print("숫자를 입력하세요 >>");
		// 3. 숫자 입력받기
		int num = sc.nextInt();
		// 4. 조건식을 판단해서 홀수, 짝수, 0인지 판단
		if(num==0) {
			System.out.println("0입니다.");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

		// 순서 중요
		
		
		
		
//		if(num%2==1) {
//			System.out.println("홀수");
//		} else if (num%2==0 && num>1) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("0");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
