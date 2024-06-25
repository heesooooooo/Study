package d01;

import java.util.Scanner;

public class Ex02시급 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int money = 0;
		if(hour<=8) {
			money= hour*5000;
		}else if(hour>8) {
			money = (int) (8*5000 + (hour-8)*5000*1.5);
		}
		System.out.println("총 임금은 "+ money +"원 입니다.");
		
		
		
		
		
		
		
		
		
	}

}
