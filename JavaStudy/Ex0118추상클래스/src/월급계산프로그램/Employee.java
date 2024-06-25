package 월급계산프로그램;

public abstract class Employee {
	// 접근제한자
	// private << default << protected << public
	// 		private : 외부 클래스 접근 불가
	// 		default : 같은 패키지에 있는 클래스만 접근 가능
	// 		protected : 상속 관계에 있거나, 같은 패키지에 있는 클래스만 접근 가능
	// 		public : 모든 클래스에서 접근 가능
	
	protected String empno;
	protected String name;
	protected int pay;
	//부모클래스 private이면 상속받아도 못 씀
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	

	public abstract int getMoneyPay();
	

	// print --> 사번 : 이름 : 연봉 을 리턴
	public String print() {
		return empno+" : "+ name+" : "+ pay; 
	}
	
	
	
	
	
	
	
}
