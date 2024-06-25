import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result=0;
		if(num%10>5) {
			result= num/10*10+10;
		}else {
			result= num/10*10;
		}
		
		System.out.print("반올림 수 : "+result);
		
		
		
	}

}
