package vishal.creational.singleton.DoubleCheckLoading;

public class Client {
	public static void main(String[] args) {
		
		DataBase db = DataBase.getInstance();
		DataBase db1 = DataBase.getInstance();
		DataBase db2 = DataBase.getInstance();
		
		System.out.println("i am here");
		
	}
}
