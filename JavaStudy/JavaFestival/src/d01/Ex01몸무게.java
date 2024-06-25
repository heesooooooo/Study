package d01;

import java.util.Scanner;

public class Ex01몸무게 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now =sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal =sc.nextInt();
		
//		int week =1;
//		while(true) {
//			System.out.print(week+"주차 감량 몸무게 : ");
//			week++;
//			int loss = sc.nextInt();
//			now-=loss;
//			if(now<=goal) {
//				System.out.println(now+"kg 달성!! 축하합니다!");
//				break;
//			}
//		} ;
		
		for(int i =1; now>goal; i++) {
			System.out.print(i+"주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			now-=loss;
			if(now<=goal) {
				System.out.println(now+"kg 달성!! 축하합니다!");
		}
		
		}
		
		
		
		
		
		
	}

}
