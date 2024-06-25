package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행공간
		RegularEmployee regular = new RegularEmployee("0001", "임경남", 7000, 700);
		System.out.println(regular.print());
		
		TempEmployee temp = new TempEmployee("0002", "강규남", 4000);
		System.out.println(temp.print());
		
		PartTimeEmployee part = new PartTimeEmployee("0003", "이도연", 30, 20);
		System.out.println(part.print());
		
		
		
		
		
		
		
	}

}
