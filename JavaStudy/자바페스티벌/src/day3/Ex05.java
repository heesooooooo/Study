package day3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();


		// 12345678
//		123
//		%1000  -> 123   123/100 -> 1
//		%100  -> 23       23/10 -> 2
//		%10 -> 3          3/1 ->3 
		
		int calc=0;
		for(int i = 100000000; i>0; i/=10) {
//			calc += (input % i) / (i/10); -- i>1로.. 
			calc += (input/i) %10;
		}
		
		System.out.println("합은 " + calc + "입니다.");
		
			
		
		
		
		

				

		
		
	}

}
