package vishal.creational.builder;

public class client {
	
	public static void main(String[] args) {
	
		XUVBuilder xuvBuilder = new XUVBuilder();
		XUVDirector xuvDirector = new XUVDirector(xuvBuilder);
		
		Car car = xuvDirector.XUVConstructor();
		
		System.out.println("I am here");
	}

}
