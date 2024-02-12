import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("Check your Grades Here!");
        System.out.print("What's your mark: ");
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();

        if (mark>=75) {
            System.out.println("A");
        }
        else if (mark>=65) {
            System.out.println("B");
        }
        else if (mark>=55) {
            System.out.println("C");
        }
        else if (mark>=35) {
            System.out.println("S");
        }
        else {
            System.out.println("W");
        }
    }
}
