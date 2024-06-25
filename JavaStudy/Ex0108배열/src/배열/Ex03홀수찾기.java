package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 array 선언
		int[] array = new int[5];
		// 2. 랜덤한 값으로 배열 값 초기화 (1~100)
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}
		// 3. 홀수값만 출력하고, 총 몇 개인지 출력
		// array에 들어있는 홀수는 53 49 5 이며,
		// 총 3개 입니다.
		System.out.print("array에 들어있는 홀수는 ");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 ==1) {
				// 홀수일 때
			System.out.print(array[i] + " ");
			count++;
		}
		}
		System.out.println("이며,");
		System.out.println("총 "+count+ "개 입니다.");
		
		
		
		//		Random ran = new Random();
//		int[] numbers = new int[5];
//		System.out.print("array에 들어있는 홀수는 ");
//		int count =0;
//		for(int i =0; i<5; i++) {
//			int ranNum = ran.nextInt(100)+1;
//		numbers[i] = ranNum;
//		if(ranNum%2==1) {
//			System.out.print(numbers[i]+ " ");
//			count++;
//		}
//		}
//		System.out.println("이며,");
//		System.out.print("총" + count+ "개 입니다."); 
//		

	}

}
