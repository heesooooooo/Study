package 월급계산프로그램;

public class RegularEmployee extends Employee{

	// 1. 필드

	private int bonus;
	

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		// 슈퍼: 부모한테 있는 생성자메소드 사용
		this.bonus = bonus;
	}
	
	

	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	
	
}
