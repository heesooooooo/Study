package d01;

import java.util.Scanner;

public class Ex05별찍기행개수_ln {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int j=0; j<num; j++) {
		for(int i=0; i<=j; i++) {   //** i<=j
			System.out.print("*");
		}System.out.println();
		}
		
	}

}
