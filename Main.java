public class Main {
	public static void main (String[] args) {
    		double area1 = calculateArea(5.5, 4.2);
   		double area2 = calculateArea(7.1, 2.3);
    		double area3 = calculateArea(9.9, 1.2);

		calculateArea(-5.5, 4.2);

		String englishExplanation = explainArea("English");
		String frenchExplanation = explainArea("French");
		String spanishExplanation = explainArea("Spanish");
		String italianExplanation = explainArea("Italian");
	}
    
   	public static double calculateArea(double length, double width) {
		if (length < 0 || width < 0){
			System.out.println("Invalid Dimensions");
			System.exit(0);
		}
		double area = length * width; 
		return area;
	}
     
    public static String explainArea(String language) {
        switch(language){
       	    case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "Area es igual a largo * ancho";
            defualt: return "Language not available";
        }
    }
}
