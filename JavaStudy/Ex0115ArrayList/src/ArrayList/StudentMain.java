package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(짝꿍의 이름, 나이를 가지고 있는 데이터(Student)를 추가)
//		Student s1 = new Student("김이박", 24);
//		sList.add(s1);      
		// ---> 한줄로 줄이기 ㄱㄴ
		sList.add(new Student("김이박",24));
		
		
		// 3. 짝꿍의 이름 출력
		System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 확인할 것!!
		// sList.get(0) --> return type : Student (초록색동그라미 옆 확인) ---> 객체
		
		
		// 4. 팀원 데이터를 전부 추가하기
		
		
		sList.add(new Student("오인영",29));
		sList.add(new Student("조범수",24));
		sList.add(new Student("정대주",24));

		
		System.out.println("==== 팀원 정보 ====");
		for(Student s : sList) {
			System.out.println(s.getName()+"\t"+s.getAge());
		}
		
		
		
		
		
		
		
		
		
	}

}
