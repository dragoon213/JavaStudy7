package com.iu.s1.human;
import java.util.ArrayList;
/*
 * 
 * 주소록 만들기
 * @ 22.01.13
 * 
 * 
 * */
import java.util.Scanner;
import java.util.StringTokenizer;

public class ContactsMenu {
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		ContactsService cs = new ContactsService();
		ContactsView cv = new ContactsView();
		ArrayList<ContactsDTO> ar = new ArrayList<>();
		boolean check = true;
	
		while (check) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				cv.view(ar);
			} else if (select == 2) {
				ContactsDTO cDTO = cs.searchContacts(ar);
				cv.View(cDTO);
			} else if (select == 3) {
				ContactsDTO cDTO = cs.addContacts();
				ar.add(cDTO);
				System.out.println(ar);
			} else if (select == 4) {
				boolean flag = cs.removeContacts(ar);
				if(flag) {
					System.out.println("성공");
				} else 
					System.out.println("실패");
			} else {
				System.out.println("finish");
				break;
			}			
		}	// end of while
	}
	
//	public static void main(String[] args) {
//		String info = "김춘식,파댕이,chunsik@naver.com,010-1234-5678,5-5";
//		
//		StringTokenizer st = new StringTokenizer(info, ",");
//		while(st.hasMoreTokens()) {
//			
//		}
		
	}
