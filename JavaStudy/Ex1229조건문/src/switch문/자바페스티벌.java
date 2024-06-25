package switch문;

import java.util.Scanner;

public class 자바페스티벌 {

	public static void main(String[] args) {

		
		
		
	
		
		
		
//		

		
		
/		Scanner sc = new Scanner(System.in);
/		System.out.print("숫자 입력 : ");
/		int num = sc.nextInt();
/		int result =0;
//		if (num%10 >=5) {
//			result = num/10*10+10;
//		} else {
//			result = num/10*10;
//		}
		
		//result 안하고 num = num/10*10 + 10
		//반올림 수: +num
		if (num>0){
			if(num%10>=5) {
				num=num/10*10+10;
			}else {
				num=num/10*10;
			}
		}
/		System.out.println("반올림 수 : "+ result );
		
		




		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		System.out.println(num1* (num2%10));
		System.out.println(num1* (num2%100/10));
		System.out.println(num1* (num2/100));
		System.out.println(num1*num2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
