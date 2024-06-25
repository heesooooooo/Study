package d01;

import java.util.Scanner;

public class Ex12이중배열세로_출력ij순서 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("입력 >> ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num=1;
		for(int j=0; j<array.length; j++) {
		for(int i=0; i<array.length; i++) {
			array[i][j]=num;
			num++;
		}
		}
		

		for(int i=0; i<array.length; i++) {   //출력은 i j 순서 바꿔서 가로(1행)먼저..
		for(int j=0; j<array.length; j++) {
		System.out.print(array[i][j]+"\t");
		}
		System.out.println();
		}
		
		
		
	}

}
