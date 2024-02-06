import java.util.Scanner;

public class Pyramid {

    private static final Scanner integer = new Scanner(System.in);
    public static void main(String[] args){
        
        
        System.out.print("Please enter the symbol you would like to use: ");
        String scanner = integer.nextLine();

        System.out.print("Please enter integer number: ");
        int readnumber = integer.nextInt();
        // Draw number = new Draw();

        Draw pyramid = new Draw();
        integer.skip("\r\n|[\n\r\u2008\u2009\u0085]?");
        pyramid.loopThrough(readnumber,scanner);

        integer.close();
    }   
}

class Draw{

    // static int pyramid(int number){
    //     return number;
    // }
    void loopThrough(int number,String symbol){

        for(int i=1;i<=number;i++){

            for(int j=1;j<=i;j++){

                System.out.printf("%s",symbol);
            }
            System.out.println();
        }
    }

}