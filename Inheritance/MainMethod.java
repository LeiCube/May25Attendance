package Inheritance;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota_VIOS = new Car();
		
		Toyota_VIOS.speed = 100;
		Toyota_VIOS.color = "Silver";
		Toyota_VIOS.price = 1005000;
		System.out.println(Toyota_VIOS.speed + "km/h");
		System.out.println(Toyota_VIOS.color);
		System.out.println("Php "+Toyota_VIOS.price);
		System.out.println(Toyota_VIOS.tireType);
		
		Toyota_VIOS.drive();
		Toyota_VIOS.stop();
		
		System.out.println("--------------");
		
		Plane U2_Spy_Plane = new Plane();
		
		U2_Spy_Plane.speed = 900;
		U2_Spy_Plane.color = "White";
		U2_Spy_Plane.price = 45000000;
		System.out.println(U2_Spy_Plane.speed + "km/h");
		System.out.println(U2_Spy_Plane.color);
		System.out.println("Php "+U2_Spy_Plane.price);
		System.out.println(U2_Spy_Plane.wingspan+ " ft");
		
		U2_Spy_Plane.fly();
		U2_Spy_Plane.stop();
		
		System.out.println("--------------");
		
		Boat FandangoYacht = new Boat();
		
		FandangoYacht.speed = 60;
		FandangoYacht.color = "Brown";
		FandangoYacht.price = 38000000;
		System.out.println(FandangoYacht.speed + "km/h");
		System.out.println(FandangoYacht.color);
		System.out.println("Php" + FandangoYacht.price);
		System.out.println(FandangoYacht.MainsailColor);
		
		FandangoYacht.Float();
		FandangoYacht.stop();
		
	}

}
