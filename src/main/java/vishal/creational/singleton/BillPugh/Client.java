package vishal.creational.singleton.BillPugh;

public class Client {

	public static void main(String[] args) {

		System.out.println("I am here");

		
		DataBase  db = DataBase.getInstance();
		DataBase  db1 = DataBase.getInstance();
		DataBase  db2 = DataBase.getInstance();
		
		System.out.println("I am here");

	}

}
