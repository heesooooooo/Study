package dowhile문;

import java.util.Scanner;

public class Ex02몸무게관리프로그램 {

	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		// 3. 목표 몸무게 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// 4. 주차별 감량 몸무게 입력받기
		// ---> 언제 다이어트를 성공할지 모름! 주차도 변수 선언하기
		int week = 1;
		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
				//** 감량 몸무게 입력 후 week 증가
			// 5-1. 현재 몸무게 = 원래 몸무게 - 감량 몸무게(변수 더 만들필요 X)
			now -= minus;
			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!!");
			break;
			}
		} while (true);
				// ****now kg 달성으로 하면 알아서 감량된 몸무게로..

		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//			
//			System.out.print("현재몸무게 : ");
//			int current = sc.nextInt();
//			System.out.print("목표몸무게 : ");
//			int goal = sc.nextInt();
//			
//			
//			int week = 1;
//			while (true) {
//				System.out.print(week + "주차 감량 몸무게 : ");
//				int loss = sc.nextInt();
//				week++;
//				current-=loss;
//				if(current<=goal) {
//					System.out.println(current + "kg 달성!! 축하합니다!!");
//					break;
//				}
//			}

	}

}
