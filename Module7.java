/**
 * @author: Mehdi Fanou
 * 
 * multiple methods of using statements which includes adding and multplying
 **/
import java.util.Scanner;
class Module7 {

   static Scanner in = new Scanner(System.in);
   public static void main(String[] args) {

   System.out.println("Enter a value: ");

      int userValue = in.nextInt();

       System.out.println("Enter a Choice: \ns = do Sum\nf = do Factorial");

      String choice = in.next();

      switch (choice.charAt(0)) {

          case 's': System.out.println("Sum of up to this number is: " + sum(userValue));

              break;

          case 'f': System.out.println("Factorial of up to this number is: " + factorial(userValue));

              break;

          default: System.out.println("Unavailable Choice");
         }
}

   public static int sum(int userValue) {

       int sum = 0;

       for (int x = 1; x <= userValue; x++) {

           sum += x;

       }

       return sum;

   }


   public static int factorial(int userValue) {

       int factorial = 1;

       for (int x = 1; x <= userValue; x++) {

           factorial *= x;

       }

       return factorial;

   }


}