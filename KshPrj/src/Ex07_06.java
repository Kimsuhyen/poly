import java.util.Scanner;

public class Ex07_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;

		do {
			System.out.printf("\n�մ� �ֹ��Ͻðڽ��ϱ� ? \n");
			System.out.printf("<1>ī��� <2>īǪ�ϳ� <3>�Ƹ޸�ī�� <4>�׸���ų���� => ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.printf("#ī��� �ֹ��ϼ̽��ϴ�. \n");
				break;
			case 2:
				System.out.printf("#īǪġ�� �ֹ��ϼ̽��ϴ�. \n");
				break;
			case 3:
				System.out.printf("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�. \n");
				break;
			case 4:
				System.out.printf("#�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�. \n");
				break;
			default:
				System.out.printf("�߸� �ֹ��ϼ̽��ϴ�. \n");
			}
		} while (menu != 4);
	}
}