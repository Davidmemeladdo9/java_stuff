// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.text.NumberFormat;
// import java.util.Scanner;

// public class Calculate {

//     private static final Scanner scanner = new Scanner(System.in);

//     // private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//     public static void main(String[] args){
//         final byte MONTHS_IN_YEAR = 12;
//         final byte PERCENT = 100;

//         System.out.print("Principal: ");
//         int principal = scanner.nextInt();

//         System.out.print("Annual Interest Rate: ");
//         float annualInterest = scanner.nextFloat();
//         float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

//         System.out.print("Period (Years): ");
//         byte years = scanner.nextByte();
//         int numberOfPayments = years * MONTHS_IN_YEAR;

//         double mortage= principal * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
//                         / (Math.pow(1+ monthlyInterest, numberOfPayments)-1);
//         String mortageFormatted =NumberFormat.getCurrencyInstance().format(mortage);
//         System.out.println("Mortgage: "+ mortageFormatted);
//         scanner.close();
//     }
// }
