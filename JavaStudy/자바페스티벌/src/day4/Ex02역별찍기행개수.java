package day4;

import java.util.Scanner;

public class Ex02역별찍기행개수 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("행 개수 : ");
		int input = sc.nextInt();
		
		for(int j=0; j<input; j++) {
		for(int i=input; i>j; i--) {
			System.out.print("*");
		}System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
