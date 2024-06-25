package day5;

import java.util.Arrays;
import java.util.Random;

public class Ex03로또 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] lotto= new int[6];
		for(int i=0; i<lotto.length; i++) {
		lotto[i]= ran.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) { //j는 앞에 자리들, i는 뒷자리
					i--;
					break;
				}
			}
			System.out.println("행운의숫자 : "+lotto[i]);
		}
	}

}
