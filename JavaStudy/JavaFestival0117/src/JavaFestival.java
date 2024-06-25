import java.util.Scanner;

public class JavaFestival {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		
		for(int j =num; j>=0; j--) {
		for(int i =0; i<j; i++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		
	}

}
