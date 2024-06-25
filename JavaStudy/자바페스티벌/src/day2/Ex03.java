package day2;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
			
			int fail=0;

			while(true) {
			int ranNum1 = ran.nextInt(9);
			int ranNum2 = ran.nextInt(9);
			System.out.print(ranNum1 + " + " + ranNum2 + " = ");
			int userAnswer = sc.nextInt();
			if(ranNum1+ranNum2==userAnswer) {
				System.out.println("SUCCESS!");
			} else { 
				System.out.println("Fail...");
				fail++;
				if(fail==5) {
					System.out.println("GAME OVER");
					break;
				}
			}
			
		} 
		
		
		

	}

}
