import java.util.Scanner;

public class Codeup_1026 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        String[] A = arr.split("\\:");
        int b = Integer.parseInt(A[1]);
 
        if(b <= 9)
            System.out.printf("%1d", b);
        else
            System.out.printf("%d", b);
    }
}