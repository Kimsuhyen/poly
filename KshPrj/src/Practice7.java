import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Practice7 {
	public static void main(String[] args) {
		List<HashMap<String, String>> rlist = new ArrayList<>();
		HashMap<String, String> pmap = new HashMap<>();

		pmap.put("name", "김수현");
		pmap.put("email", "psal@nav");
		pmap.put("addr", "서울");

		rlist.add(pmap);
		pmap = null; // 메모리에서 값을 지워 버리라는 의미

		pmap = new HashMap<String, String>(); // 다시 메모리에 올림

		pmap.put("name", "홍길동");
		pmap.put("email", "hong@");
		pmap.put("addr", "경기");

		rlist.add(pmap);
		pmap = null; // 사용이 끝나면 메모리에서 지움22

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