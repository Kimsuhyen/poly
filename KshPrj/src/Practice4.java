public class Practice4 {

	public static void main(String[] args) {
		int i = 3, j;
		while (i < 9) {
			if (i == 3 || i == 5)
				System.out.println("<" + i + "��>");
			j = 1;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			i++;
			System.out.println("");

		}

	}
}