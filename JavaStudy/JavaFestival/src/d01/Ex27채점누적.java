package d01;

import java.util.Scanner;

public class Ex27채점누적 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String test = sc.next();
		String[] arr=test.split("");
		
		int count =0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("o")) {
				count++;
				sum+=count;
			}else {
				count=0;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
