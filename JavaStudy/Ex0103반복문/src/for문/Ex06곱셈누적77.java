package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {

		
	// (77*1)+(76*2)+...+(1*77)을 계산하여 결과 출력
		int sum = 0;
		int num=1;
		for(int i = 77; i>0; i--) { // i: 77--> 1
			sum += (i*num); // num : 1 --> 77
			num++;
		}
		System.out.println(sum);
		
		
		
		
//		
//		int total =0; 
//		for(int i = 77; i>=1 ; i-- ) {
//			total += i*(78-i);
//		}		System.out.print(total);
//
//	
		
		
		
		
		
		
	}

}
