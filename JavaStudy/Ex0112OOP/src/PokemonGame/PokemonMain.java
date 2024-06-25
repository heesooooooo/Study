package PokemonGame;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {

		// 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 실행공간

		// 두마리 포켓몬 생성 (객체 생성)
		// 메타몽 / 노멀 / 변신하기 / hp : 80 / atk : 10

		Pokemon meta = new Pokemon("메타몽", 80, 10, "변신하기", "노멀");
		// 괄호 안에 쓰면 다섯줄 안 써도 됨

//		meta.setName("메타몽");
//		meta.setType("노멀");
//		meta.setSkill("변신하기");
//		meta.setHp(80);
//		meta.setAtk(10);

		// 피카츄 / 전기 / 백만볼트 / hp : 100 / atk : 15

		Pokemon pika = new Pokemon("피카츄", 100, 15, "백만볼트", "전기");

		while (true) {
			System.out.println("포켓몬을 선택하세요. ");
			System.out.print("[1]메타몽 [2]피카츄 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 사용자가 메타몽을 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반 공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반 공격하겠다.
					// 1. 메타몽의 atk만큼 피카츄의 hp가 감소한다.
					// 피카츄의 현재 hp = 피카츄의 현재 hp - 메타몽의 atk
//					int pikaHp = pika.getHp();
//					pikaHp -= meta.getAtk();

//					int hp = pika.getHp() - meta.getAtk();
//					pika.setHp(pikaHp);      	
					pika.setHp(pika.getHp() - meta.getAtk()); // set에 넣어주기..

					// 2. 두마리 포켓몬의 현재 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());

				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬 공격하겠다.
					// 1. 메타몽의 atk의 1.5배만큼 피카츄의 hp 감소한다.
					// 피카츄의 현재 hp = 피카츄의 현재 hp - 메타몽의 atk*1.5
					pika.setHp((int) (pika.getHp() - meta.getAtk() * 1.5));
					// ** 안에 (int)씌워주기

					// 2. 메타몽의 스킬을 출력
					System.out.println(meta.getName() + "!!!! " + meta.getSkill() + "!!!!");

					// 3. 두마리 포켓몬의 현재 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());

				}

			} else if (choice == 2) {
				// 사용자가 피카츄를 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반 공격 [2]스킬공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 피카츄가 메타몽을 일반 공격하겠다.
					// 1. 피카츄의 atk만큼 메타몽의 hp가 감소
					// 메타몽의 현재 hp = 메타몽의 현재 hp - 피카츄의 atk
					meta.setHp(meta.getHp() - pika.getAtk());
					// 2. 두 포켓몬의 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());

				} else if (choiceAtk == 2) {
					// 피카츄가 메타몽을 스킬 공격하겠다.
					// 3. 피카츄의 atk*1.5만큼 메타몽의 hp 감소
					// 메타몽의 현재 hp = 메타몽의 현재 hp - 피카츄의 atk*1.5
					meta.setHp((int) (meta.getHp() - pika.getAtk() * 1.5));

					// 4. "피카츄!!!! 백만볼트!!!!" 라고 출력
					System.out.println(pika.getName() + "!!!! " + pika.getSkill() + "!!!!");

					// 5. 두 포켓몬의 hp 출력
					System.out.println("메타몽의 hp : " + meta.getHp());
					System.out.println("피카츄의 hp : " + pika.getHp());

				}

			} else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}

			////////////////////////////////////////////////////
			// 1. 둘중에 한마리의 hp가 0보다 작거나 같을 때 프로그램을 종료
			// 2. 승자가 누구인지 출력
			// 단, Pokemon 설계도는 건들지 말 것

			if (meta.getHp() <= 0) {
				System.out.println("피카츄 승");
				break;
			} else if (pika.getHp() <= 0) {
				System.out.println("메타몽 승");
				break;
			}

		}

	}

}
