package db.service;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {

				//�Է¹޴� ���� �����ϱ� ���� ��ü ����
				Map<String, String> pMap = new HashMap<String, String>();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("----------------------------");
				System.out.print("ȸ�����̵� �Է��Ͻÿ� : ");
				pMap.put("user_id" , sc.next());
				
				System.out.println("----------------------------");
				System.out.print("ȸ���̸��� �Է��Ͻÿ� : ");
				pMap.put("user_nm" , sc.next());

				System.out.println("----------------------------");
				System.out.print("�̸��ϸ� �Է��Ͻÿ� : ");
				pMap.put("email" , sc.next());
				
				System.out.println("----------------------------");
				System.out.print("�ּҸ� �Է��Ͻÿ� : ");
				pMap.put("addr" , sc.next());
				
				// ����� ������ �޸� ����
				sc.close();
				
				// DB ����� ���� ��ü�� �޸𸮿� �ø�
				DBinsert dbI = new DBinsert();
				
				// DB ����ϱ� ���� �Լ� ȣ��
				dbI.doInsert(pMap);
				
				// ����� ������ �޸� ����
				pMap = null;
				
		// ȸ�� ������ �������� ���� DBUserInfo ��ü�� �޸𸮿� �ø�
		DBUserInfo ui = new DBUserInfo();
		// ȸ������ ��������
		List<Map<String, String>> rList = ui.getUserInfo();

		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}

		System.out.println("-------------------------");
		System.out.println("ui.getUserInfo() �Լ��κ��� ���޹��� ȸ�� ���� ����մϴ�. ");
		System.out.println("-------------------------");

		Iterator<Map<String, String>> it = rList.iterator();

		while (it.hasNext()) {

			Map<String, String> rMap = it.next();

			if (rMap == null) {
				rMap = new HashMap<String, String>();
			}

			System.out.println("ȸ�����̵�(user_id) : " + rMap.get("user_id"));
			System.out.println("ȸ���̸�(user_um) : " + rMap.get("user_um"));
			System.out.println("�̸���(email) : " + rMap.get("email"));
			System.out.println("�ּ�(addr) : " + rMap.get("addr"));
			System.out.println("������(reg_dt) : " + rMap.get("reg_dt"));
			System.out.println("-------------------------");

			rMap = null;
		}

		rList = null;

	}
}