import java.sql.SQLOutput;
import java.util.Scanner;

public class StringInputDemo {
    public static void main (String [] args){

        // create a scanner to read user inputs
        Scanner scanner = new Scanner(System.in);

        // prompt the user
        System.out.print("What is yor favorite color? ");

        // Read the user inputs
        String color = scanner.nextLine();

        // Displaying output
        System.out.println("My favourite color is " + color);

        // close to release the resources and prevents resource /memory leaks
        scanner.close();

    }

}
