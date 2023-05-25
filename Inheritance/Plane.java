package Inheritance;

public class Plane extends Vehicle {

	int wingspan = 112;
	
	void fly() {
		System.out.println("The Plane is Flying");
	}
	
	@Override
	void stop() {
		System.out.println("THE PLANE STOPPED");
	}
}
