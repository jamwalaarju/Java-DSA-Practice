import java.util.Scanner;

public class NumberInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade Exam1: ");
        double gradeExam1 = scanner.nextDouble();

        System.out.print("Enter grade Exam2: ");
        double gradeExam2 = scanner.nextDouble();

        System.out.print("Enter grade Exam3: ");
        double gradeExam3 = scanner.nextDouble();

        double gradeAverage =(gradeExam1 + gradeExam2 + gradeExam3) /3;
        System.out.println("Grade Average: " + gradeAverage);  //output = 84.66666666666667

        String formatOutput = String.format("%.2f",gradeAverage);
        System.out.println("Formatted average : " + formatOutput); //output = 84.67
    }
}
