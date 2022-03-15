// calculate and display the volume of sphere
import java.util.Scanner;
public class qno10 {
	public static double sphereVolume(double radius) {
		return(4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double radius=0.0,volume=0.0;
		System.out.printf("ENTER THE RADIUS");
		radius=input.nextInt();
		System.out.printf("volume=%.3f",sphereVolume(radius));
	}
}
