import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ListMapExam2 {

	public static void main(String[] args) {

		List<HashMap<String, String>> rList = new ArrayList<>();

		HashMap<String, String> pMap = new HashMap<>();

		pMap.put("name", "김수현");
		pMap.put("email", "suhyen21@naver.com");
		pMap.put("addr", "서울");
		pMap.put("dept", "데분");

		rList.add(pMap);

		pMap = null;

		pMap = new HashMap<>();

		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "경기");
		pMap.put("dept", "시각");

		rList.add(pMap);

		pMap = null;

		Iterator<HashMap<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();

			System.out.println("########	반복시작!!! ##############");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("eamil"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));

			rMap = null;
			System.out.println("########	반복시작!!! ##############");

		}
	}

}