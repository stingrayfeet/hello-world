
public class ComputeAreaAndcircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hello
		// hello2
		//declaring and assigning variables
		final double PI = Math.PI;
		double radius = 20.0;
		double area ;
		double circumference;
		
		//compute area and circumference
		area = radius * radius * PI;
		circumference = 2 * radius;
		
		//print out calculation
		System.out.println("The area of circle with a radius " + radius + " is " + area);
		System.out.println("The circumference of the circle with a radius " + radius +" is " + circumference);
	}

}
