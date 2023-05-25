package Inheritance;

public class Car extends Vehicle{
	
	String tireType = "Highway Tires";
	
	void drive() {
		System.out.println("The car is Moving");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("THE CAR STOPPED");
	}
	
}
