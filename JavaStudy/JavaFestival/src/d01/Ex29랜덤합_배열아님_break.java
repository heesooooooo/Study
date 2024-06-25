package d01;

import java.util.Random;
import java.util.Scanner;

public class Ex29랜덤합_배열아님_break {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int fail=0;
		while(true) {
			int num1= ran.nextInt(9);					//배열 아니고 이렇게..
			int num2= ran.nextInt(9);
			System.out.print(num1+" + "+num2+ " = ");
			int input = sc.nextInt();
			if(input==num1+num2) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				fail++;
				if(fail==5) {
					System.out.println("GAME OVER!");    //게임오버 하고 break
					break;
				}
			}
		}
		
		
		
		
	}

}
