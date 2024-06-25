package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 노래를 재생시키는 도구 생성하기 ---> MP3Player
		MP3Player mp3 = new MP3Player();
		

		// 복붙하면 \\두개 늘어나는데 그냥 써도 ㄱㅊ
		String comPath = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\JavaStudy\\\\Ex0115ArrayList\\\\player\\\\";
		// 2. 노래 데이터(Music 객체)를 생성(Music 자료형 사용하기)
		// 노래 데이터를 전부 저장하는 ArrayList 생성, 이름은 musicList
		ArrayList<Music> musicList = new ArrayList<Music>();
 
		Music m1 = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");
		musicList.add(m1);
		// IAM / 아이브 / 198 / 경로
		// LoveLee / 악동뮤지션 / 200 / 경로
		// Smoke / 다이나믹듀오 / 210 / 경로
		// 한페이지가될수있게 / Day6 / 185 / 경로
		// 노래전부 musicList에 추가

		// **m2, m3 만들지 말고 바로 넣기
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가될수있게", "Day6", 185, comPath + "한페이지가될수있게.mp3"));

		System.out.println("=============희수의 Mp3플레이어=============");

		int i = 0; // 몇번째 곡인지 기억하고 있는 변수
					// **while문 안에 있으면 i++한 거 다시 0으로 초기화됨
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			
			if (input == 1) {
				System.out.println("======재생======");
				// 1. 재생중인 노래가 있는지 여부를 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 멈추기
					mp3.stop();
				}
				// 3. musicList의 0번 방에 있는 노래를 재생
				// 노래를 재생하기 위해서 필요한 데이터는?
				// 노래의 주소가 필요함

				mp3.play(musicList.get(i).getPath());
				// **musicList.get() = Music

				// 4. 가수 - 노래제목 이 재생중입니다. 출력
				// ex) 뉴진스 - HypeBoy 이(가) 재생중입니다.

				System.out
						.println(musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");

				
			} else if (input == 2) {
				System.out.println("======정지======");
				// 1. 노래가 재생중인지 여부 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 멈추고
					// "노래재생을 정지합니다!" 출력
					mp3.stop();
					System.out.println("노래재생을 정지합니다!");
				} else {
					// 3. 재생중이 아니라면
					// "재생중인 노래가 없습니다." 출력
					System.out.println("재생중인 노래가 없습니다.");
				}

				
			} else if (input == 3) {
				System.out.println("======이전곡======");
				// 1. 노래가 재생중인지 여부 확인
				if(mp3.isPlaying()) {
				// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				// 3. musicList 이전곡 재생
				// i 값 2 --->1/ 4 --->3
				
				
				i--;
				if(i>=0) {
					mp3.play(musicList.get(i).getPath());
					// 4. 재생중인 노래의 정보 출력
					// ex) 뉴진스 - Hypeboy 이(가) 재생중입니다..
					System.out.println(musicList.get(i).getSinger()+" - "
					+musicList.get(i).getTitle()+" 이(가) 재생중입니다.");
				} else {
					// 5. 더이상 이전곡이 없을 경우
					// "이전 곡이 없습니다."를 출력
					System.out.println("이전 곡이 없습니다.");
					// 6. 다시 재생을 선택했을 경우 
					//    musicList의 가장 첫번쨰 곡이 재생되도록 만들기
					i=0;
				}
			}
				
				// 1. 노래가 재생중인지 여부 확인
				
				// 3. musicList 이전곡 재생
				// i의 값이 2 ---> 1 / 4 ---> 3
//				if (i == 0) {
//					if (mp3.isPlaying()) {
//						// 2. 재생중이라면 노래를 정지
//						mp3.stop();
//						System.out.println("이전 곡이 없습니다.");
//					}
//					// 4. 재생중인 노래의 정보 출력
//					// ex) 뉴진스 - Hypeboy 이(가) 재생중입니다.
//				}
//				// 5. 더이상 이전곡이 없을 경우
//				// "이전 곡이 없습니다."를 출력
//				else {
//					if (mp3.isPlaying()) {
//						// 2. 재생중이라면 노래를 정지
//						mp3.stop();
//						i--;
//						System.out.println(
//								musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");
//					}
//					mp3.play(musicList.get(i).getPath());
//				}
				// 6. 다시 재생을 선택했을 경우
				// musicList의 가장 첫번째 곡이 재생되도록 만들기
			
			
			else if (input == 4) {
				System.out.println("======다음곡======");

				// 1. 재생중인 노래가 있는지 여부 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				// 3. musicList(우리가 만든 ArrayList)에서 다음곡 재생
				// 0 ---> 1 / 1 ---> 2
				i++;
				if (i < musicList.size()) {

					mp3.play(musicList.get(i).getPath());

					// 4. 현재 재생중인 노래 출력
					System.out.println(
							musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");

				} else {
					// 5. 단, 다음곡이 없다면
					// "다음곡이 없습니다."를 출력
					System.out.println("다음곡이 없습니다.");

					// 6. 다시 재생을 선택한다면 musicList의 마지막 곡이 재생되게 만들기
					// 우리노래는 딱 5곡 있다는 거 기억하기
					i = musicList.size() - 1;

				}

				
			} else if (input == 5) {
				System.out.println("======mp3종료======");

				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			} else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}

		}

	}

}
