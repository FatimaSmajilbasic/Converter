
public class Conversion {
      double number;
      
      Conversion(double number){
    	  this.number = number;
      }
      public static double toPounds( double number) {
    	  return number / 0.4536;
      }
      public static double toKilograms( double number) {
    	  return number * 0.4536;
      }
      public static double toInches( double number) {
    	  return number / 2.54;
      }
      public static double toCentimetres( double number) {
    	  return number * 2.54;
      }
      public static double toFahrenheit( double number) {
    	  return number * 1.8 + 32 ;
      }
      public static double toCelsius( double number) {
    	  return (number - 32) / 1.8 ;
      }
}
