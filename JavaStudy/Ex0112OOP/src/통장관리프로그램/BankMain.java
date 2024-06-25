package 통장관리프로그램;

public class BankMain {

	// 실행공간
	public static void main(String[] args) {
		// 1. Bankbook 설계도면을 기반으로 bank1 객체 생성
		// 자료형 변수명 = new 자료형();
		Bankbook bank1 = new Bankbook();
//		System.out.println(bank1.money);
//		bank1.money=-100;
		
		// 2. bank1에 1000원 입금
		bank1.deposit(1000);
		// 3. bank1에서 300원 출금
		bank1.withdraw(300);
		
		// bank1 잔액 확인
		System.out.println(bank1.showMoney());
		
		
		
		
	}

}
