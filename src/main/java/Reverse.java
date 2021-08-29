import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        Reverse.reverse(num);
    }
    public static void reverse(int number) {
        for (int i = 0; number > 0; i++) {
            int rev = number % 10;
            number = number / 10;
            System.out.print(rev);
        }
    }
}
