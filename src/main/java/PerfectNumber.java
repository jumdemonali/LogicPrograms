import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("It is perfect number");
        } else {
            System.out.println("It is not perfect number");
        }
    }
}
