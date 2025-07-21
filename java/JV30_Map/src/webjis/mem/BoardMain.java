package webjis.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardMain {
	
	private static ArrayList<Board> board = new ArrayList<Board>();
	
	public static void main(String[] args) {
		
		ManageMember.insertMember(new Member("aaa123", "하정우"));
		ManageMember.insertMember(new Member("aaa123", "이정재"));
		
		ManageMember.selectMember("aaa123");
		
		writeBoard(new Board(1, "첫글", "첫글이에요", "aaa123"));
		writeBoard(new Board(2, "ㅇㅇ?", "ㅇㅇ!", "aaa123"));
		
		displayBoardById("aaa123");
		
		//
		Map<String, Board> bMap = new HashMap<String, Board>();
		bMap.put("1", new Board(1, "첫글", "첫글이에요", "aaa123"));
		bMap.put("2", new Board(2, "ㅇㅇ?", "ㅇㅇ", "aaa123"));
		bMap.put("3", new Board(3, "ㄴㄴ!", "ㄴㄴ", "aaa123"));
		bMap.put("4", new Board(4, "ㅁㅁ", "ㅁㅁ", "aaa123"));
		
		Map<String, Map> memboard = new HashMap<String, Map>();
		
		memboard.put("member", ManageMember.getMemberList());
		memboard.put("board", bMap);
		
		HashMap<String, Member> newMemMap = (HashMap<String, Member>)memboard.get("member");
		HashMap<String, Board> newBoardMap = (HashMap<String, Board>)memboard.get("board");
		
		for (Map.Entry<String, Board> entry : newBoardMap.entrySet()) {
			Board tmpBoard = entry.getValue();
			System.out.println(tmpBoard.getBoardNo() + " | " + tmpBoard.getTitle() + " | " + 
			tmpBoard.getContent() + " | " + newMemMap.get(tmpBoard.getMemberId()).getMemberName());
		}
		
		
	}
	
	public static void writeBoard(Board b) {
		if (ManageMember.getMemberList().containsKey(b.getMemberId())) {
			board.add(b);
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}
	
	public static void displayBoardById(String memberId) {
		for(int i = 0; i < board.size(); i++) {
			if(memberId.equals(board.get(i).getMemberId())){
				System.out.println(board.get(i));
			}
		}
	}

}
