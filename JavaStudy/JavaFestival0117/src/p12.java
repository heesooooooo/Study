
public class p12 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num = -1;
			} else {
				num = 1;
			}
			sum += num * i;
			System.out.print((i * num) + " ");

		}
		System.out.println();

		System.out.print("결과 : " + sum);

	}

}
