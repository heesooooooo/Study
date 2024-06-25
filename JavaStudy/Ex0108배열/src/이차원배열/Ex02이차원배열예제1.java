package 이차원배열;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {

		// 1. 5행 5열 이차원 배열 생성하기
		int[][] array = new int[5][5];
		// 2. 21부터 시작하는 변수 num 만들기
		int num = 21;
		// 3. 열부터 데이터가 저장될 수 있도록 코드 작성 (위에서 아래 방향)
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}
		// 4. 행부터 데이터가 출력될 수 있도록 코드 작성 (왼쪽에서 오른쪽 방향)
		for (int j = 0; j < array.length; j++) {
			
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[j][i]+"\t");
		}
		System.out.println();
		}
		
		
		

//		int[][] array = new int[5][5];
//		int num=21;
//		for (int j = 0; j < array.length; j++) {
//		for (int i = 0; i < array.length; i++) {
//			array[i][j] = num++;
//		}
//		}
//
//		for (int j = 0; j < array.length; j++) {
//			
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[j][i]+"\t");
//		}
//		System.out.println();
//		}
//		

	}

}
