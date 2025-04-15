package vishal.creational.singleton.DoubleCheckLoading;


public class DataBase {
	
	private static DataBase instance = null;
	
	private DataBase () {}
	
	public static DataBase getInstance() {
		
		if(instance == null) {
			synchronized (DataBase.class) {
				if(instance == null) {
					instance = new DataBase();
				}				
			}			
		}
		return instance;
	}
	
	

}
