package vishal.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
	
	private Map<String, Bird> map = new HashMap<>();
	
	public void registerBird(String name, Bird bird) {
		map.put(name, bird);
	}
	
	
	public Bird getBirdClone(String name) {
		return map.get(name).clone();
	}
	
	
	
	

}
