package d01;

import java.util.Scanner;

public class Ex15등차_순서 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		int plus=1;
		
		for(int i=1; i<=num; i++) {
			System.out.print(plus+" ");   // 초기값1이랑 순서...
			plus+=i;
		
		}
		
		
		
		
		
		
	}

}
