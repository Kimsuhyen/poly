import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam2 {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>();

		rList.add("�����");
		rList.add("�����");
		rList.add("�����");
		rList.add("�����");

		System.out.println("�迭�� ũ��" + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ������ : " + rList.get(i));
		}

		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();

			System.out.println("�̸� : " + name);
		}
	}
}