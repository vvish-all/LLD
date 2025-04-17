package vishal.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		BirdRegistry registry = new BirdRegistry();
		Pigeon pigeon1 = new Pigeon();
		Pigeon pigeon2 = new Pigeon();
		Crow crow1 = new Crow();
		Crow crow2 = new Crow();

		
		pigeon1.setColor("White");
		pigeon1.setName("one");
		pigeon1.setWeight(0.5);
		pigeon1.setSound("koo");
				
		pigeon2.setColor("Black");
		pigeon2.setName("two");
		pigeon2.setWeight(0.6);
		pigeon1.setSound("doo");

		crow1.setColor("White");
		crow1.setName("one");
		crow1.setWeight(0.5);
		crow1.setLeg("Small");
//		crow1.set
				
		crow2.setColor("Black");
		crow2.setName("two");
		crow2.setWeight(0.6);
		crow2.setLeg("big");
		
		List<Bird> registerBirds = List.of(
				pigeon1,
				pigeon2,
				crow1,
				crow2);
		//putting prototype birds in registry
		for(Bird bird : registerBirds) {
			registry.registerBird(bird.getName(), bird);
		}
		
		//Making clone of prototype birds
		List<Bird> clonedBirds = new ArrayList<>();
		
		for(Bird bird: registerBirds) {
			clonedBirds.add(bird.clone());			
		}
		
		
		System.out.println("I am here");
		
		
	}

}
