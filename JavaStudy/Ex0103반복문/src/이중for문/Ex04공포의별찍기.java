package 이중for문;

public class Ex04공포의별찍기 {

	public static void main(String[] args) {

		// * -> space 4번 *1번
		// **
		// ***
		// ****
		// *****

	
		
		
	
		
		//	--맨 밑에는 space없기 때문에 *을 j랑 제어
		// -- i<4 를 i<5-j로	
		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5-j; i++) { //4-3-2-1-0
				System.out.print(" ");
			}
			for (int i = 0; i < j; i++) { //1-2-3-4-5
				System.out.print("*");
			}
			System.out.println();
		}
		

//		for(int k=4; k>0; k--) 
//		{for(int l=0; l<k; l++) {
//			System.out.print(" ");
//	}
//		}

//		for(int j =1; j<6; j++ ) {
//			for(int k=5; k>j; k--) {
//				System.out.print(" ");
//			}
//			
//				for(int i=0; i<j ; i++) {
//			System.out.print("*");
//		}System.out.println();
//		}
//		

	}

}
