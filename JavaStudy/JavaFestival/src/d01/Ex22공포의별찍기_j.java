package d01;

public class Ex22공포의별찍기_j {

	public static void main(String[] args) {

		// 4-3-2-1-0 / 1-2-3-4-5

		for (int j = 1; j <= 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
