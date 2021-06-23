import java.util.Scanner;

public class Codeup_1023 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] A = a.split("\\.");
        System.out.printf("%s\n%s", A[0], A[1]);
    }
}