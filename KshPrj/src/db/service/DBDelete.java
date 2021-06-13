package db.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DBDelete {
   public static void main(String[] args) throws SQLException{
      Map<String, String> pMap = new HashMap<String, String>();
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("-------------------------------");
      System.out.print("������ ȸ�����̵� �Է��Ͻÿ� : ");
      pMap.put("user_id", sc.next());
      
      sc.close();
      
      DBDelete dbD = new DBDelete();
      
      pMap = null;
      
      DBUserInfo ui = new DBUserInfo();
      
      List<Map<String, String>> rList = ui.getUserInfo();
      
      if (rList == null) {
         rList = new ArrayList<Map<String, String>>();
      }
      
      System.out.println("-------------------------------");
      System.out.println("ui.getUserInfo() �Լ��κ��� ���޹��� ȸ�� ������ ����մϴ�.");
      System.out.println("-------------------------------");
      
      Iterator<Map<String, String>> it = rList.iterator();
      
      while (it.hasNext()) {
         Map<String, String> rMap = it.next();
         
         if (rMap == null) {
            rMap = new HashMap<String, String>();
         }
         
         System.out.println("ȸ�����̵�(user_id) : " + rMap.get("user_id"));
         System.out.println("ȸ���̸�(user_nm) : " + rMap.get("user_nm"));
         System.out.println("�̸���(email) : " + rMap.get("email"));
         System.out.println("�ּ�(addr) : " + rMap.get("addr"));
         System.out.println("������(reg_dt) : " + rMap.get("reg_dt"));
         System.out.println("-------------------------------");
         
         rMap = null;
      }
      rList = null;
   }
}