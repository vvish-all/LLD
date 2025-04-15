package vishal.creational.singleton.singlethread;

public class DataBase {

	private static DataBase instance = null;

	private DataBase() {
		
		//code for databse
	}
	
	

	public static DataBase getInstance() {

		if (instance == null) {

			instance = new DataBase();
		}

		return instance;
	}

}
