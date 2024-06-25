package d01;

import java.util.Random;

public class Ex18로또_break {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(45) + 1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
					break; //*******break
				}
			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 : " + array[i]);    //밖으로 빼기
		}

	}

}
