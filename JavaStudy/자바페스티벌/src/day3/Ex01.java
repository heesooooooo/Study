package day3;

public class Ex01 {

	public static void main(String[] args) {
		
		int total=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print((i) + " ");
				total+=i;
			} else {
				System.out.print(-i + " ");
				total-=i;
			}
		}
	
		
		System.out.println();
		System.out.println("결과 : " +total);

		
		
		
	}

}
