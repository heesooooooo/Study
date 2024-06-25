import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("입력: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
//		[i][j]
		int num =1; 
		for(int i =0; i<arr.length; i++) {
			if(i%2==0) {
			for(int j=0; j<arr.length; j++ ) {
				arr[i][j]=num++;
			}
			}else {
				for(int j=arr.length-1; j>=0; j-- ) {
					arr[i][j]=num++;
				}
		}
	}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
