package d01;

import java.util.Scanner;

public class Ex30 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String input = sc.nextLine();

		
		char[] arr = new char[input.length()];
		
		for(int i =0 ; i<input.length();i++) {
			arr[i] = input.charAt(i);
		}
		
		int[] cnt = new int[26];
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>='a' && arr[i]<='z') {
				cnt[arr[i]-'a']++;
			}else if(arr[i]>='A' && arr[i]<='Z') {
				cnt[arr[i]-'A']++;
			}
			
		}
		for(int i=0; i<26; i++) {
		System.out.println((char)(i+'a') +" : "+cnt[i]); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
