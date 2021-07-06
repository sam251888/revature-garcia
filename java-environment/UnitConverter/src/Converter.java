package Main;
import java.util.Scanner;
public class Converter {
	public static void main(String [] args) {
		int menuSelection = 0;
		Scanner sc =  new Scanner(System.in);
		Scanner scUnit = new Scanner (System.in);
		String input1 = "", input2 = "";
		double units = 0;
		while (menuSelection != 5) {
			System.out.println("Please select an option: \r\n"
				 + "1. Distance conversions\r\n"
				 + "2. Weight conversions\r\n"
				 + "3. Volume conversions\r\n"
				 + "4. Quit");
			input1 = sc.nextLine();
			menuSelection = Integer.parseInt(input1);
			switch (menuSelection) {
				case 1 : 
					System.out.println("Please select distance conversion:\r\n"
					+ "1. Miles to Feet\r\n"
					+ "2. Feet to Meters\r\n");
				    input2 = sc.nextLine(); 
				    if(0 <= Integer.parseInt(input2) || Integer.parseInt(input2) >= 3){
				        System.out.println("That selection is invalid...\n");
				        break;
				    }
					System.out.println(collectQuantity(input1, input2));
				    break;
				case 2 :
				    System.out.println("Please select weight conversion:\r\n"
					  + "1. Grams to Pounds\r\n");
				    input2 = sc.nextLine();
				    if(0 <= Integer.paSrseInt(input2) || Integer.parseInt(input2) >= 2){
				        System.out.println("That selection is invalid...\n");
				        break;
				    }
				    System.out.println(collectQuantity(input1, input2));
				    break;
			   case 3 :
				    System.out.println("Please select volume conversion:\r\n"
					  + "1. Liters to Ounces");
				    input2 = sc.nextLine();
				    if(0 <= Integer.parseInt(input2) || Integer.parseInt(input2) >= 2){
				        System.out.println("That selection is invalid...\n");
				        break;
				    }
				    System.out.println(collectQuantity(input1, input2));
				    break;
			   case 4 :
				    break;
//  The following commented code is what the original instructions were requesting, the code being used is for the optimization
//			System.out.println("Please select an option: \r\n"
//					+ "1. Miles to Feet \r\n"
//					+ "2. Grams to Pounds \r\n"
//					+ "3. Liters to Ounces \r\n"
//					+ "4. Feet to Meters \r\n"
//					+ "5. Quit");
//			input = sc.nextLine();
//			menuSelection = Integer.parseInt(input);
//			switch (menuSelection) {
//			case 1 : 
//				System.out.println("Please input miles");
//				units = scUnit.nextDouble(); 
//				System.out.println(convertMilesToFeet(units));
//				break;
//			case 2 :
//				System.out.println("Please input grams");
//				units = scUnit.nextDouble();
//				units = units *  0.00220462;
//				System.out.println(units);
//				break;
//			case 3 :
//				System.out.println("Please input liters");
//				units = scUnit.nextDouble();
//				units = units * 33.814;
//				System.out.println(units);
//				break;
//			case 4 :
//				System.out.println("Please input feet");
//				units = scUnit.nextDouble();
//				units = units / 0.3048;
//				System.out.println(units);
//				break;
			}		
		}
	}
	private static double collectQuantity(String unit1, String unit2){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units to convert:");
		double units = sc.nextInt();
		if(unit1.equals("1")){
			switch(unit2){
				case "1":
					return convertMilesToFeet(units);
				case "2": 
					return convertFeetToMeters(units);
			}
		}
		else if (unit1.equals("2")){
			switch(unit2){
				case "1":
					return convertGramsToPounds(units);
			}
		}
		else if(unit1.equals("3")){
			switch(unit2){
				case "1":
					return convertLitersToOunces(units);
			}
		}
		return 0;
		}
	public static double convertMilesToFeet(double qty) {
		return qty * 5280;
	}
	public static double convertGramsToPounds(double qty) {
		return qty * 0.00220462; 
	}
	public static double convertLitersToOunces(double qty) {
		return qty * 33.814;
	}
	public static double convertFeetToMeters(double qty) {
		return qty * 0.3048;
	}
}	
		