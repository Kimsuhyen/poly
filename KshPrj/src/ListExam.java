import java.util.LinkedList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {

		List<String> rList = new LinkedList<>();

		rList.add("�����");
		rList.add("�����");
		rList.add("�����");
		rList.add("�����");

		System.out.println("�迭�� ũ��" + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ������ : " + rList.get(i));
		}

	}
}