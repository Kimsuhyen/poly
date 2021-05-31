public class Method {
	public static void main(String[] args) {
		System.out.println("maint함수 호출 시작! !");
		int res = sum(1, 2);
		System.out.println("sum함수 실행결과 : " + res);
		System.out.println("main함수 호출 끝! !");
	}

	public static int sum(int i1, int i2) {
		System.out.println("sum함수 호출 시작! !");
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += 1;
		System.out.println("sum함수 호출 끝! !");
		return sum;
	}
}