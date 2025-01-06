import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {

        int minimumVotingAge = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age = ");
        int age = scanner.nextInt();

        System.out.println("Minimum age for votinng ="+ minimumVotingAge);

        if(age>=minimumVotingAge) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Sorry, you are not eligible to vote");
        }

    }
}
