package Inheritance;

public class Boat extends Vehicle{
	
	String MainsailColor = "White";
	
	void Float() {
		System.out.println("The boat is Floating");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("THE BOAT STOPPED");
	}
}
