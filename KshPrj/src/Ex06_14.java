public class Ex06_14 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			System.out.printf("[" + i + "]��");

			for (int j = 1; j < 10; j++) {
				System.out.printf(i + " x " + j + " = " + (i * j));
			}
		}

	}
}