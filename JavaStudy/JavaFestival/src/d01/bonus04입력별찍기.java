package d01;

import java.util.Scanner;

public class bonus04입력별찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[]array= new int[5];
		
		for(int i =0 ; i<array.length; i++) {	//array.length
		System.out.print(i+"번째 별의 수 : ");
		int num=sc.nextInt();
		array[i]=num;
		}
		
		for(int i=0; i<array.length; i++) { 	//array.length
			System.out.print(array[i]+":");
			for(int j=0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println(); 				//계행
		}
		
		
		
	}

}
