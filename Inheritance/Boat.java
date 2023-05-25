package Inheritance;

public class Boat extends Vehicle{
	
	String MainsailColor = "White";
	
	void Float() {
		System.out.println("The boat is Floating");
	}
	
	@Override
	void stop() {
		System.out.println("THE BOAT STOPPED");
	}
}
