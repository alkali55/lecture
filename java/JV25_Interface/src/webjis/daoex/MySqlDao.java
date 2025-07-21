package webjis.daoex;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySQL DB 조회");

	}

	@Override
	public void insert() {
		System.out.println("MySQL DB 저장");

	}

	@Override
	public void update() {
		System.out.println("MySQL DB 수정");

	}

	@Override
	public void delete() {
		System.out.println("MySQL DB 삭제");

	}

}
