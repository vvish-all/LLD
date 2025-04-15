package vishal.creational.singleton.eagerLoading;


public class DataBase {
	
	private static DataBase instance = new DataBase();
	
	private DataBase () {}
	
	public static DataBase getInstance() {
		
		return instance;
		
	}
	
	

}
