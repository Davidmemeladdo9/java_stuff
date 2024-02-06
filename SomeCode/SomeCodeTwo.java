package SomeCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeCodeTwo {

    // private static final Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a line of text:");
            String line = reader.readLine();
            System.out.println("You entered: " + line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    

