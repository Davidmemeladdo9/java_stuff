import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String read = scanner.nextLine();
        System.out.println("Your name is: "+ read);
        scanner.close();
    }
    
}
