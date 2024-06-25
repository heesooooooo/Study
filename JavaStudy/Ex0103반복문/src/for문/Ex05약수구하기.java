package for문;

import java.util.Scanner;

public class Ex05약수구하기 {

	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력받기
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		// 3. 약수 출력하기
		for(int i =1; i<=input; i++) {
			// ---> 입력받은 숫자를 임의의 숫자로 나누었을 때
			//      나머지가 0이면 약수
			if(input%i==0) {
				// 약수인 경우
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		for(int i=1; i<=num; i++ ) {
//			if(num%i==0) {
//			System.out.print(i+" ");
//		}
//		}
		
		
		
		
		
		
		
		
	}

}
