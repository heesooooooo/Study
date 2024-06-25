package d01;

import java.util.Scanner;

public class Ex17삼의배수_i범위 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i =0; i<10; i++) {                       // i =1~10 하면 범위 벗어나니까 이렇게 하고
			System.out.print((i+1)+"번 째 정수 입력>>");    // (i+1)번째 정수
			array[i]= sc.nextInt();
		}
		
		System.out.print("3의 배수 : " );
		
		for(int i =0; i<array.length; i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
			}
		}
		
		
		
		
	}

}
