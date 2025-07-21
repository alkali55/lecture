package webjis.mem;

public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String memberId;
	
	Board(int boardNo, String title, String content, String memberId) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.memberId = memberId;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getMemberId() {
		return memberId;
	}

	@Override
	public String toString() {
		return "[" + boardNo + ", " + title + ", " + ManageMember.getMemberList().get(memberId).getMemberName() + ", " + content + "]";
	}
	
	
	
	
}
