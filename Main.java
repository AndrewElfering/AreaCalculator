public class Main {
	public static void main (String[] args) {
		double area1 = calculateArea(5.5, 4.2);
		double area2 = calculateArea(7.1, 2.3);
		double area3 = calculateArea(9.9, 1.2);
	}
	
	public static double calculateArea(double length, double width) {
		double area = length * width; 
		return area;
	}
}
