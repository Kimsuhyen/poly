import java.util.LinkedList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {

		List<String> rList = new LinkedList<>();

		rList.add("김수현");
		rList.add("김수현");
		rList.add("김수현");
		rList.add("김수현");

		System.out.println("배열의 크기" + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 : " + rList.get(i));
		}

	}
}