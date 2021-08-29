import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int count = sc.nextInt();
        System.out.print("Fibonacci Series of " + count + " numbers:");
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
}