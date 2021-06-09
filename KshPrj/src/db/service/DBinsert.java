package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBinsert {

	public static void doInsert(Map<String, String> pMap) {

		try {

			Connection conn = DBConn.getDBConncetion();

			PreparedStatement pstmt = null;

			String sql = "INSERT INTO USER_INFO<USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, ";
			sql += "?, ";
			sql += "?, ";
			sql += "?) ";

			//
			pstmt = conn.prepareStatement(sql);

			int idx = 0;

			//

			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id : " + user_id);
			pstmt.setString(++idx, user_id);

			String user_um = pMap.get("user_um");
			System.out.println("전달받은 user_um : " + user_um);
			pstmt.setString(++idx, user_um);

			String email = pMap.get("email");
			System.out.println("전달받은 email : " + email);
			pstmt.setString(++idx, email);

			String addr = pMap.get("addr");
			System.out.println("전달받은 addr : " + addr);
			pstmt.setString(++idx, addr);

			//
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("데이터 등록 성공!");

			} else {
				System.out.println("데이터 등록 실패!");

			}

			pstmt = null;

			//
			DBConn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}