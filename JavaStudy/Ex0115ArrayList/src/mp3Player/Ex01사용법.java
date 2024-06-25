package mp3Player;

import javazoom.jl.player.MP3Player;

public class Ex01사용법 {

	public static void main(String[] args) {

		// jar
		// -> 일종의 java project를 압축해놓은 확장자
		// -> 다른사람들이 개발해놓은 class파일들이 모아져 있는 형태
		// -> 일종의 라이브러리
		
		// jar 파일 추가하는법/-*/**		// 프로젝트 선택 -> 마우스 우클릭 -> build path -> configure build path
		// -> libraries 탭으로 이동 -> class path 선택 -> 우측에 있는 add jars 선택
		// -> 원하는 jar파일 추가 후 -> apply and close
		
		// 노래 재생 가능한 도구 꺼내기
		MP3Player mp3 = new MP3Player();
		
		// 1. 재생하기
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\한페이지가될수있게.mp3");
		mp3.stop();
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\LoveLee.mp3");
		// 2. 노래 멈추기
		mp3.stop();
		
		// 3. 노래 재생여부 판단하기
		System.out.println(mp3.isPlaying());
		
		
		
		
		
		
		
		
		
		
		
	}

}
