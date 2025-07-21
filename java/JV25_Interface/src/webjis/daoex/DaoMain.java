package webjis.daoex;

public class DaoMain {

	public static void main(String[] args) {
		
//		doWork(new OracleDao());
		doWork(new MySqlDao());

	}

	private static void doWork(DataAccessObject dao) {
		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();		
		
	}

}
