import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListMapExam {

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

	}

}