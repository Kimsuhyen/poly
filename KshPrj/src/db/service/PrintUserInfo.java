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

				//입력받는 값을 전달하기 위해 객체 생성
				Map<String, String> pMap = new HashMap<String, String>();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("----------------------------");
				System.out.print("회원아이디를 입력하시오 : ");
				pMap.put("user_id" , sc.next());
				
				System.out.println("----------------------------");
				System.out.print("회원이름를 입력하시오 : ");
				pMap.put("user_nm" , sc.next());

				System.out.println("----------------------------");
				System.out.print("이메일를 입력하시오 : ");
				pMap.put("email" , sc.next());
				
				System.out.println("----------------------------");
				System.out.print("주소를 입력하시오 : ");
				pMap.put("addr" , sc.next());
				
				// 사용이 끝나면 메모리 비우기
				sc.close();
				
				// DB 등록을 위한 객체를 메모리에 올림
				DBinsert dbI = new DBinsert();
				
				// DB 등록하기 위한 함수 호출
				dbI.doInsert(pMap);
				
				// 사용이 끝나면 메모리 비우기
				pMap = null;
				
		// 회원 정보를 가져오기 위해 DBUserInfo 객체를 메모리에 올림
		DBUserInfo ui = new DBUserInfo();
		// 회원정보 가져오기
		List<Map<String, String>> rList = ui.getUserInfo();

		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}

		System.out.println("-------------------------");
		System.out.println("ui.getUserInfo() 함수로부터 전달받은 회원 정보 출력합니다. ");
		System.out.println("-------------------------");

		Iterator<Map<String, String>> it = rList.iterator();

		while (it.hasNext()) {

			Map<String, String> rMap = it.next();

			if (rMap == null) {
				rMap = new HashMap<String, String>();
			}

			System.out.println("회원아이디(user_id) : " + rMap.get("user_id"));
			System.out.println("회원이름(user_um) : " + rMap.get("user_um"));
			System.out.println("이메일(email) : " + rMap.get("email"));
			System.out.println("주소(addr) : " + rMap.get("addr"));
			System.out.println("가입일(reg_dt) : " + rMap.get("reg_dt"));
			System.out.println("-------------------------");

			rMap = null;
		}

		rList = null;

	}
}