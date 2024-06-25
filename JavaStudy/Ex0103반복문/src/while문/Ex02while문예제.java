package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 : 출력하기
		int num = 0;
		// ***** int 밖으로 뺐으면 중괄호 안에는 
		// ***** int 빼고 num =sc ~
//		while (num < 10) {
//			System.out.print("정수 입력 : ");
//			// 3. 정수 입력받기
//			num = sc.nextInt();
//		}
//		// 2~3 구간이 반복. 10보다 큰 수를 입력하면 종료
//		System.out.println("종료되었습니다.");

		// 무한반복문
		//**int 밖에서 선언 안해도 됨..?
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if(num>=10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
//		동희	
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = sc.nextInt();
//			if(num>10) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//		}

//		
//		
//		while (num < 10) {
//			System.out.print("정수입력 : ");
//			Scanner scanner =new Scanner(System.in);
//			int num = sc.nextInt();
//		}
//		System.out.println("종료되었습니다.");
//		

	}

}
