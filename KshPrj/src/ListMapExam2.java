import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ListMapExam2 {

	public static void main(String[] args) {

		List<HashMap<String, String>> rList = new ArrayList<>();

		HashMap<String, String> pMap = new HashMap<>();

		pMap.put("name", "�����");
		pMap.put("email", "suhyen21@naver.com");
		pMap.put("addr", "����");
		pMap.put("dept", "����");

		rList.add(pMap);

		pMap = null;

		pMap = new HashMap<>();

		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");
		pMap.put("dept", "�ð�");

		rList.add(pMap);

		pMap = null;

		Iterator<HashMap<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();

			System.out.println("########	�ݺ�����!!! ##############");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("eamil"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));

			rMap = null;
			System.out.println("########	�ݺ�����!!! ##############");

		}
	}

}