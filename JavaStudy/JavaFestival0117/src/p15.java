import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		
		System.out.println(dan+"단");
		
		for(int i=0; i<num; i++) {
			System.out.println(dan+"*"+(i+1)+"="+dan*(i+1));
		}
		
		
		
	}

}
