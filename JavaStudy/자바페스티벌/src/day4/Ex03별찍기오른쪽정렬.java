package day4;

public class Ex03별찍기오른쪽정렬 {

	public static void main(String[] args) {

		
		
//		4-3-2-1-0    1-2-3-4-5
		
		
		for(int j=1; j<6; j++) {
		
		for(int i=0; i<5-j; i++ ) {
			System.out.print(" ");
		}
			
			
		for(int i=0; i<j; i++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		
		
	}

}
