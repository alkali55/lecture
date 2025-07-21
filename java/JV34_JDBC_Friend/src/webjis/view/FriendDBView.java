package webjis.view;

import java.sql.SQLException;
import java.util.Scanner;

import webjis.controller.Action;
import webjis.controller.service.FriendManagementService;

public class FriendDBView {

//	public static S
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			outputMenu();
//			System.out.println(sc.hashCode());
//			sc.nextLine();
			int menu = Integer.parseInt(sc.nextLine());
			FriendManagementService fms = Action.getInstance().getService(menu);
			
		
			try {
				fms.toDo();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(menu==9) {
				break;
			}
		}
		
		sc.close();
	}

	private static void outputMenu() {
		System.out.println("*****************************************");
		System.out.println("*           친 구 주 소 록 v1           *");
		System.out.println("*****************************************");
		System.out.println("** 1. 친구 목록 전체 조회              **");
		System.out.println("** 2. 친구 저장                        **");
		System.out.println("** 3. 친구 검색(이름 조회)             **");
		System.out.println("** 4. 친구 수정(이름)                  **");
		System.out.println("** 5. 친구 수정(전화번호)              **");
		System.out.println("** 6. 친구 수정(주소)                  **");
		System.out.println("** 7. 친구 삭제                        **");
		System.out.println("** 9. 종료                             **");
		
		System.out.println("메뉴 번호 입력 >>> ");
		
		
	}

}
