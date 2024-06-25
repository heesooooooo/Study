package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {

		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("점수를 입력해 주세요 >> ");
		int totalScore = sc.nextInt();
		// 3. 학점 계산하기 ---> switch문으로
		char grade = 'A';
		// ****지역변수 밖에다 선언하고, 아무거나 일단 설정****
		switch(totalScore/10) {
		case 10:
			//grade 추가할 필요x, break 안 걸면 밑에 거까지 내려가니까
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		
		System.out.println(grade + "학점입니다.");
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		int totalScore = sc.nextInt();
//		switch (totalScore/10) {
//		case 10:
//			System.out.println("A학점입니다.");
//			break;
//		case 9:
//			System.out.println("A학점입니다.");
//			break;
//		case 8: 
//			System.out.println("B학점입니다.");
//			break;	
//		case 7: 
//			System.out.println("C학점입니다.");
//			break;	
//		default: 
//			System.out.println("D학점입니다.");
//			break;
//		}
		
		
		
		
		
	}

}
