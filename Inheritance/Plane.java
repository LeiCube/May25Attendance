package Inheritance;

public class Plane extends Vehicle {

	int wingspan = 112;
	
	void fly() {
		System.out.println("The Plane is Flying");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("THE PLANE STOPPED");
	}
}
