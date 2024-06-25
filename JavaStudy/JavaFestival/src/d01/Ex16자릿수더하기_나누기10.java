package d01;

import java.util.Scanner;

public class Ex16자릿수더하기_나누기10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum=0;
		
		
		for(int i=10000000; i>0; i/=10 ) {  // i/=10
			sum+= num/i%10;  // %10해주면 1의자리 숫자 나옴
		}
		
		System.out.println("합은 "+sum+"입니다.");
		
		
		
		
		
	}

}
