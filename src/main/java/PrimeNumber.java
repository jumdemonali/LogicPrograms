import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Number is not prime number");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Number is prime number");
            }
        }
    }
}
