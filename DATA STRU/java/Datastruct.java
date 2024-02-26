import java.util.Scanner;

public class Datastruct {
    public static void main(String[] args) {
        int A, B, C;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        A = input.nextInt();

        System.out.print("Enter value for B: ");
        B = input.nextInt();

        C = A + B;

        System.out.println("C = " + C);
    }
}
