package d01;

import java.util.Scanner;

public class Ex19구구단 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("단수입력 :");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		int num = sc.nextInt();
		
		System.out.println(dan+"단");
		for(int i =1; i<=num; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		
		
		
		
		
	}

}
