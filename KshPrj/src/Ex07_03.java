import java.util.Scanner;

public class Ex07_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = sc.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = sc.nextInt();

			System.out.printf("%d + %d = %d \n", a, b, a + b);
		}

	}
}