package 상속기초;

public class Child extends Parent {

	// 자식 클래스, 새로운 클래스, 서브 클래스, 
	// extends : 연장하다, 확장하다 의미!
	
	
	// 짜장면 만드는 메소드(나만의 기능)
	/**
	 * @author 엄희수
	 * @since 24.01.17
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeJjajang() {
		System.out.println("맛있는 짜장면을 만든다!");
	}
	
	
	
	
	
	// annotation(주석) : 특정기능을 가지고 있는 것은 아니다!
	@Override 
	public void makeJjam() {
		System.out.println("맛있는 해물이 듬뿍 짬뽕을 만든다! 보글보글~");
	}
	// 메소드 오버라이딩 (method overriding)
	// : 상속이 전제되어 있어야한다.
	// : 부모 클래스가 가지고 있는 메소드의 틀(메소드명, 리턴타입, 매개변수)을 
	//   그대로 가지고 와서 {} 안에 로직만 ★★★★재정의★★★★ 하는 기법
	
	
	
	
	
	
}
