package week2.assignments;

public class Specimen {

	public static void main(String[] args) {
		
		/*String name = "Accenture Solutions (10129)";
		String replacedString = name.replaceAll("[(\\d)]","");
		String trimSpace = replacedString.trim();
		System.out.println(trimSpace);*/
		String name = "?979";
		String replacedString = name.replaceAll("[?\\s]","");
		System.out.println(replacedString);
	}
	
}
