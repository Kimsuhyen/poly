public class Practice5 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = ((i+1) * 10);
			
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("num[" + i + "] " + num[i]);
			
			i++;
		}
	}
}