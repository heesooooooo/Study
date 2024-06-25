package dowhile문;

import java.util.Random;

public class Ex랜덤수만들기 {

	public static void main(String[] args) {

		
		// 랜덤한 숫자를 뽑아내는 방법
		// 1. 랜덤한 숫자를 뽑아내는 도구를 꺼내오기
		Random ran = new Random();
		// 2. 랜덤한 수 생성하기
		// 0부터 시작해서 추출하고싶은 숫자의 갯수를 적기
		// (9) 하면 0~8이니까 +1 써야 1~9
		// 1~9 추출
		int ranNum = ran.nextInt(9)+1;
		System.out.println(ranNum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
