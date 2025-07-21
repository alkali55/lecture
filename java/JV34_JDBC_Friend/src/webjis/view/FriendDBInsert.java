package webjis.view;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

import webjis.controller.dto.FriendDTO;
import webjis.controller.service.DuplicateMobileService;

public class FriendDBInsert {
	
	public static FriendDTO getFriendData() {
		
		FriendDTO dto = null;
		
		Scanner sc = new Scanner(System.in);
		
		// 이름은 not null 이어야 하므로 필수 입력조건
		String name = "";
		do {
			System.out.println("친구 이름 입력 >>> ");
			name = sc.nextLine();
		} while (name.equals(""));
		
		// 전화번호는 unique 해야 하므로, 중복 체크해야 한다.
		boolean result = false;
		
		String mobile = "";
		
		do {
			System.out.println("친구 전화번호 입력 >>> ");
			mobile = sc.nextLine();
			try {

				result = DuplicateMobileService.getInstance().duplicateMobileService(mobile);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} while (result);
		
		
		
		System.out.println("친구 주소 입력 >>> ");
		String addr = sc.nextLine();
		
		dto = new FriendDTO(name, mobile, addr);
		System.out.println(dto);
		
		return dto;
		
	}
}
