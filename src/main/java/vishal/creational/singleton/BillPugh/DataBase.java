package vishal.creational.singleton.BillPugh;

public class DataBase {
	
	
	
	private DataBase() {
		
	}

	private static class BillPughHelper {
		private static final DataBase instance = new DataBase();
	}
	
	public static DataBase getInstance () {
		return BillPughHelper.instance;
	}
	
	

}
