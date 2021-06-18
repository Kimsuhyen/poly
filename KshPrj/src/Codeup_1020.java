import java.util.Scanner;

public class Codeup_1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] arr = a.split("\\-");
		System.out.printf("%s%s", arr[0], arr[1]);
	}
}