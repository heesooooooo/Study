package 상속기초;

public class Main {

	public static void main(String[] args) {

		// 1. Parent 자료형 기반으로 p 객체 생성
		Parent p = new Parent();
		// Parent() 는 기본생성자
		
		p.makeJjam();
		
		
		// 2. Child 자료형 기반으로 c 객체 생성
		Child c = new Child();
		c.makeJjam();
		// 메소드 오버라이딩을 하면 오버라이딩한 메소드를 호출해서 사용
		c.makeJjajang();
		// 상속의 특징 3가지
		// 1. 다중상속이 불가능하다.
		// 2. 상속의 횟수가 제한이 없다.
		// 3. 모든 클래스는 Object(최상위클래스) 상속받는다.
		c.makeTang();
		
		
		
		// 객체의 형변환(Casting)
		// Reference Type에서의 형변환은 반드시 상속이 전제되어 있어야한다.
		// --> 객체 내의 필드 메소드에 접근권한 강제형변환, 자동형변환 결정한다.
		
		// 1) Upcasting(업캐스팅)
		// 	: 자식(서브, 하위) 클래스가 부모(슈퍼, 상위) 클래스 타입으로
		//	  자동형변환 하는 것
		// 부모자료형 변수명 = new 자식자료형();	  
		Parent p2 = new Child();
		// parent 틀에 child 가져오기
		p2.makeTang();
		// 만약에 자식 클래스에서 부모 클래스의 메소드를 오버라이딩(재정의)한 경우
		// 업캐스팅으로 만들어진 객체는 자식클래스의 메소드를 호출
		p2.makeJjam();   //child에서 가져와서 해물짬뽕
		
		// 2) DownCasting(다운캐스팅)
		// 부모 클래스타입이 자식 클래스로 형변환
//		Child c2 = (Child)new Parent();
		// 코드가 빨간줄이 뜬다 ---> Syntax Error!(구문 오류)
		// Exception 오류
		// : 구문 오류는 없으나 실행했을 때 예외상황이 발생하는 것!
		// 다운캐스팅은 업캐스팅된 객체를 강제 형변환으로
		// 본래의 자료형태로 되돌려 놓는 것!
		// 전제조건 : 업캐스팅된 객체만 다운캐스팅이 가능하다
		Child c2 = (Child)p2;
		c2.makeJjam();
		c2.makeJjajang();
		c2.makeTang();
		// 본래 자신이 가지고 있던 메소드를 사용할 수 있다!!
		
		
		
		
		
		
	}

}
