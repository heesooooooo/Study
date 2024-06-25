package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[]lotto = new int[5];
		
		
		for(int j =0; j<5; j++) {
			lotto[j]= ran.nextInt(10)+1;
			for(int i =0; i<j; i++) {
				if(lotto[i]== lotto[j]) {
					j--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		
		
		
//		// 1. lotto의 0번방 데이터를 랜덤한 수로 초기화(1~10)
//		lotto[0]=ran.nextInt(10)+1;
//		// 2. lotto의 1번방 데이터를 랜덤한 수로 초기화
//		lotto[1]=ran.nextInt(10)+1;
//		// 3. lotto[0]과 lotto[1]의 값이 같은지 비교
//		// ---> 같다면 lotto[1] 다시 랜덤한 숫자 부여하기
//		if(lotto[1]==lotto[0]) {
//			lotto[1]=ran.nextInt(10)+1;
//		}
//		// 4. lotto의 2번방 데이터를 랜덤한 수로 초기화
//		lotto[2]=ran.nextInt(10)+1;
//		// 4-1. lotto[0]과 lotto[2]의 값이 같은지 비교
//		// ---> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기
//		if(lotto[2]==lotto[0]) {
//			lotto[2]=ran.nextInt(10)+1;
//		}
//		// 4-2. lotto[1]과 lotto[2]의 값이 같은지 비교
//		// ---> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기
//		if(lotto[2]==lotto[1]) {
//			lotto[2]=ran.nextInt(10)+1;
//		}
//		
//		System.out.println("====로또타임====");
//		System.out.println("이번주 출력번호는요...!!두구두구두구두구!!!!");
//		for(int i =0; i<lotto.length; i++) {
//			lotto[i]=ran.nextInt(10)+1;
//			for(int j=0; j<i; j++) {
//				if(lotto[i]==lotto[j]) {
//					lotto[i]=ran.nextInt(10)+1;
//				}
//			}
//			System.out.print(lotto[i]+" ");
//		}
//		
//		
		
		
	}

}
