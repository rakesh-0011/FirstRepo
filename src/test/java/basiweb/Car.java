package basiweb;

public class Car {

	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.fullthrotal();
		Car c2 = new Car();
		c2.full_speed(200);
	}

	public void fullthrotal() {
		System.out.println("the car is going at full speed");
	}

	public void full_speed(int MaxSpeed) 
	{
		System.out.println("maxspeed  :" + " " + MaxSpeed);

	}

}
