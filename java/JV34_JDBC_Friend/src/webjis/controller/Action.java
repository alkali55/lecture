package webjis.controller;

import java.util.Scanner;

import webjis.controller.service.FriendManagementService;
import webjis.controller.service.OutputAllFriendService;
import webjis.controller.service.SaveFriendService;
import webjis.controller.service.modifyNameService;
import webjis.controller.service.searchFriendService;

public class Action {
	
	private static Action instance = null; 
	
	// 싱글톤
	
	private Action() {} // private 기본 생성자
	
	public static Action getInstance() {
		if (instance == null) {
			instance = new Action();
		}
		
		return instance;
	}
	
	public FriendManagementService getService(int menu) {
		
		FriendManagementService result = null;
		
		switch (menu) {
		case 1:
			result = new OutputAllFriendService();
			break;
		case 2:
			result = new SaveFriendService();
			break;
		case 3:
			result = new searchFriendService();
			break;
		case 4:
			result = new modifyNameService();
			break;
		case 9:
//			Scanner sc = new Scanner(System.in);
//			sc.close();
			System.exit(0);
			break;
		}
		
		return result;
		
	}
	
}
