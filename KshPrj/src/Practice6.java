import java.util.ArrayList;
import java.util.List;

public class Practice6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("��ü�������α׷���");
		list.add("�ϵ�");
		list.add("MongoDB");

		int i = 0;
		while (i < list.size()) {
			if (i == 0)
				System.out.println("<" + list.get(i) + ">");
			else
				System.out.println(list.get(i));
			i++;
		}

	}

}