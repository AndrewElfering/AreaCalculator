public class Main {
	public static void main (String[] args) {
		calculateArea(5.5, 4.2);
		calculateArea(7.1, 2.3);
		calculateArea(9.9, 1.2);
	}
	
	public static void calculateArea(double length, double width) {
		double area = length * width; 
		System.out.println("Area = " + area);
	}
}
