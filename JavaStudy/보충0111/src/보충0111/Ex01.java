package 보충0111;

public class Ex01 {

	public static void main(String[] args) {
		int result=0;
		for(int i=1; i<101; i++) {
			if(i%2==1) {
			System.out.print(i+" ");
			result+=i;
			}else {
				System.out.print(-i+" ");
				// ** "-"+i 말고 그냥 -i 가능
			result-=i;
			}
		}
		System.out.println();
		System.out.println("결과 : "+result);
		
		
		
		
		// for : 반복 횟수가 정해져 있을 때 (~언제부터 ~언제까지)
		// i=0 .... 0
		// i=1 .... 1
		// i=2 .... 2
//		// i=3 
//		for(int i=0; i<3; i++) {
//			System.out.println(i);
//		}
//		
//		// 1부터 9까지 출력 시켜주세요
//		// 구구단 2단을 출력 시켜주세요
//		for(int i=1; i<10; i++) {
//			System.out.println("2*"+i+"="+2*i);
//		}
//		
//		
//		
//		
		
	}

}
