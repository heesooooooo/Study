package d01;

public class Ex23이차원배열90회전_ij위치 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 1;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = num++;
			}
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
			System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		int num1=1;  
		for (int i = 0; i <array.length ; i++) {
			for (int j = (array.length-1) ; j>=0; j--) {   //j--하고 안쪽으로
				array[j][i] = num1++;
			}
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
			System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
