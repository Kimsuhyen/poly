import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {

		Map<String, String> pMap = new HashMap<>();

		pMap.put("name", "김수현");
		pMap.put("email", "suhyen21@naver.com");
		pMap.put("dept", "데이터분석과");

		System.out.println("------------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("------------------------------");
	}

}