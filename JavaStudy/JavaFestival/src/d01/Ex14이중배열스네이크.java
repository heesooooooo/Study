package d01;

import java.util.Scanner;

public class Ex14이중배열스네이크 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num = 1;

		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num;
					num++;                   // array[j][i]=num++;로 줄여쓰기
				}
			} else {
				for (int i = (n-1); i >= 0; i--) {   // n-1 ~ 0
					array[j][i] = num++;
				}
			}
		}
		
		
		
		for(int j=0; j<array.length; j++) {
			for(int i =0; i<array.length; i++) {
				System.out.print(array[j][i]+"\t");   // 계행 없애기
			}
			System.out.println();					  // for문 안에 계행 추가
		}
		
		
		
		
		
	}

}
