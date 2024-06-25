package day2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			if(num1==0 && num2==0) 
				break;
			System.out.print("결과 >> " + (num1-num2));
			System.out.println();
		} while (true);

	}

}
