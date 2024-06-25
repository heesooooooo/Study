package d01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex20이진수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		while(num>0) {
			arr.add(num%2);
			num/=2;
		}
		
		for(int i =arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i)+" ");
		}
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>>");
//		int num = sc.nextInt();
//		String result = "";
//		
//		while(num>0) {
//			result += (num%2) + " ";
//			num = num/2;
//		}
//		
//		System.out.println(result);
//		
	}

}
