import java.util.Scanner;

public class p02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력>>");
		int n= sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int num =1;
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr.length; j++) {
				arr[j][i]=num++;
			}
		}
		
		for(int j =0; j<arr.length; j++) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[j][i]+"\t");
			}
		System.out.println();
		}
		
		
		
	}

}
