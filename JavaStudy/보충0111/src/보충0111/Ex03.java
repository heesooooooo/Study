package 보충0111;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 배열 --> 여러개의 데이터를 일괄된 순서로 한번에 
		//         다룰 수 있는 데이터 구조(자료구조)
		
		// 숫자 데이터 5개를 담을 수 있는 array배열을 만들고 싶어요
//		int[] array = new int[5];
//		array[0]=10;
//		array[1]=20;
//		array[2]=30;
//		array[3]=40;
//		array[4]=50;
//		int num=10;
//		for(int i=0; i<array.length; i++) {
//			array[i]=num;
//			num+=10;
//		}
//		
		// 1. 정수 데이터 10개를 담을 수 있는 numArray를 만들어주세요
		// 2. numArray에 사용자가 입력한 값을 전부 채워주세요
		
		int[] numArray = new int[10];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<numArray.length; i++) {
			System.out.print("입력 : ");
//			***int input = sc.nextInt();
//			***numArray[i]=input;  --> 이렇게 말고 한줄로 줄이기
			numArray[i]=sc.nextInt();
//			System.out.println(numArray[i]);
			
		}
		
		
	}

}
