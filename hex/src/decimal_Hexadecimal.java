import java.util.InputMismatchException;
import java.util.Scanner;

public class decimal_Hexadecimal{
    public static void main(String arg[]){
        Scanner scanner;
        int decimal_Number;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter number in Decimal from 0 to 10000: ");
            decimal_Number= scanner.nextInt();
            if (decimal_Number <=10000){
                String hexadecimal_Number = Integer.toHexString(decimal_Number);
                System.out.println("Decimal number of :" + decimal_Number +" is = "+ hexadecimal_Number.toUpperCase() +" in Hexadecimal");
            }
            if(decimal_Number > 1 & decimal_Number <= 10) {


                String binary_Number = Integer.toBinaryString(decimal_Number);
                System.out.println("Decimal number of :" + decimal_Number + " is = " + binary_Number + " in Binaries");
                System.out.println("Binary number of :" + binary_Number + " is = " + decimal_Number + " in Decimal");

            }
        } catch( InputMismatchException ex1 ) {
            System.err.println("Please Input in Integer not string :");
        }
    }
}
