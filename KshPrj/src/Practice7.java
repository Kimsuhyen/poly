import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Practice7 {
	public static void main(String[] args) {
		List<HashMap<String, String>> rlist = new ArrayList<>();
		HashMap<String, String> pmap = new HashMap<>();

		pmap.put("name", "�����");
		pmap.put("email", "psal@nav");
		pmap.put("addr", "����");

		rlist.add(pmap);
		pmap = null; // �޸𸮿��� ���� ���� ������� �ǹ�

		pmap = new HashMap<String, String>(); // �ٽ� �޸𸮿� �ø�

		pmap.put("name", "ȫ�浿");
		pmap.put("email", "hong@");
		pmap.put("addr", "���");

		rlist.add(pmap);
		pmap = null; // ����� ������ �޸𸮿��� ����22

		Iterator<HashMap<String, String>> it = rlist.iterator();
		while (it.hasNext()) {
			HashMap<String, String> rmap = it.next();
			System.out.println("name : " + rmap.get("name"));
			System.out.println("email : " + rmap.get("email"));
			System.out.println("addr : " + rmap.get("addr"));
			System.out.println();
		}

	}

}