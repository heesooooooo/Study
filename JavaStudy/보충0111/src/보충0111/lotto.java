package 보충0111;

import java.util.Arrays;
import java.util.Random;

public class lotto {

	public static void main(String[] args) {

		// 중복 없이 숫자 6개 뽑기
		int[] roto = new int[6];

		// 랜덤값으로 배열에 값 담아주기
		Random ran = new Random();
		for (int i = 0; i < roto.length; i++) {
			roto[i] = ran.nextInt(45)+1;
			// roto[2] = rd.nextInt();
			// 앞서 뽑은 숫자와 비교하는 반복문
			for (int j = 0; j < i; j++) {
				if (roto[j] == roto[i]) {
					i--;
				}
			}

		}
		System.out.println(Arrays.toString(roto));
	}

}
