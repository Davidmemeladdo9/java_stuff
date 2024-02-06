import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        
        final int FIVE = 5;
        final int THREE = 3;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number%FIVE==0 && number %THREE==0){
            System.out.println("FizzBuzz");

        }else if(number%FIVE==0){
            System.out.println("Fizz");

        }else if(number%THREE==0){
            System.out.println("Buzz");

        }else{
            System.out.println("Number neither is divisible by three or five");
        }
        scanner.close();

    }
    
}
