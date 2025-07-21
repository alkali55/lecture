package webjis.daoex;

public class OracleDao implements DataAccessObject{
	
	@Override
	public void select() {
		System.out.println("Oracle DB 조회");
	}
	
	@Override
	public void insert() {
		System.out.println("Oracle DB 저장");	
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}
}
