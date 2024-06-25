package d01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24_x보다작은수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n= sc.nextInt();
		System.out.print("X 입력 >> ");
		int x= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 정수 입력 >> ");
			array[i] = sc.nextInt();    // int num=sc.안하고 바로 배열에 넣기
//			if (num<x) {				// 여기서 비교하지 말고 밑으로...
//				array[i]=num;
//			}
		}
		
		System.out.print("결과 >> ");
		for(int i=0; i<n; i++) {
			if (array[i]<x) {     // 
				System.out.print(array[i]+" ");
			}
		}
		
		
		
		
		
		
		
		
	}

}
