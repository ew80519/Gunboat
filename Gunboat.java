import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
    
        	Scanner reader = new Scanner(System.in);
        	System.out.println("Enter distance to target.\n");
        	double d = reader.nextDouble();
        	System.out.println("Enter the height of the battery relative to the water line.\n");
        	double h = reader.nextDouble();
        	System.out.println("Enter the initial velocity of the projectile.\n");
        	double v = reader.nextDouble();
		
		double a = -4.9 * (d/v) * (d/v);
		double b = d;
        	double c = a + h;	
        
        	double tanAngle = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        	double Angle = Math.atan(tanAngle) * (180/3.14159265359);
        	System.out.println("Angle of cannon: " + Angle);
		
	}
}
