import java.util.Scanner;

public class Codeup_1034 {
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String octalNum = scan.nextLine();
        int num = Integer.parseInt(octalNum, 8);
        System.out.print(num);
    }
}