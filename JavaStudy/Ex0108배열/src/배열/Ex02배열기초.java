package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

	int[] numbers = new int[5];
	
	// 배열의 길이
	// 변수명.length;
	int length = numbers.length;
	System.out.println("배열의 길이 : " + length);
	
	// 배열의 각 칸을 5의 배수로 초기화해 주세요.
	// 5 10 15 20 25
	for(int i =0; i < numbers.length; i++){
		numbers[i] = 5*(i+1);
	}
	
	// 배열의 값을 전부 출력
	// 5 10 15 20 25
	for(int i=0; i<numbers.length; i++) {
		System.out.print(numbers[i]+" ");
	}
	
	System.out.println();
	
	// 배열을 생성함과 동시에 데이터 집어넣는 방법
	String[] names = {"엄희수", "우동희", "오인영"};
	// 우동희라는 데이터 출력하기
	System.out.println(names[1]);
	
	
	
	
	
	
	
	
	
//	for(int i = 0; i<numbers.length; i++){
//		System.out.print(numbers[i] + " ");
//	}
	
	
	
	
	
	
//	numbers[0] = 5;
//	numbers[1] = 10;
//	numbers[2] = 15;
//	numbers[3] = 20;
//	numbers[4] = 25;
//	
//	for(int i =0; i<5; i++) {
//		numbers[i] = 5*(i+1);
//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
