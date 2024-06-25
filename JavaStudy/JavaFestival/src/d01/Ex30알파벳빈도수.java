package d01;

import java.util.Scanner;

public class Ex30알파벳빈도수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String input = sc.nextLine(); // 띄어쓰기때문에 nextLine()
		alpha(input);

	}

	public static void alpha(String input) { // 리턴 void

		char[] arr = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}

		int[] cntarr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				cntarr[arr[i] - 'a']++;
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				cntarr[arr[i] - 'A']++;

			}

		}

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 'a') + " : " + cntarr[i]);
		}

	}

}
