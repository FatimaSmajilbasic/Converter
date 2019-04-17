import java.util.Scanner;
public class Conversion_test {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Select which conversion you want :");
	System.out.println("a)  kg to lb \nb)  lbs2 to kg \nc)  cm to in \nd)  in to cm \ne)  C to F \nf)  F to C ");
	char choice = input.next().charAt(0);
    System.out.print("Insert number : ");
    double number = input.nextDouble();
    
	switch(choice) {
	case 'a' : System.out.print(number + " kg = " + Conversion.toPounds(number) + " lb"); break;
	case 'b' : System.out.print(number + " lb = " + Conversion.toKilograms(number) + " kg"); break;
	case 'c' : System.out.print(number + " cm = " + Conversion.toInches(number) + " in"); break;
	case 'd' : System.out.print(number + " in = " + Conversion.toCentimetres(number) + " cm"); break;
	case 'e' : System.out.print(number + " C = " + Conversion.toFahrenheit(number) + " F"); break;
	case 'f' : System.out.print(number + " F = " + Conversion.toCelsius(number) + " C"); break;
	
	}
	
     input.close();
	}

}
