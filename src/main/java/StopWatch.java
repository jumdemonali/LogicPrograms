import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
public class StopWatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any key to start");
        scan.nextLine();
        Instant start = Instant.now();
        System.out.println("Enter any key to stop");
        scan.nextLine();
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start,end).toMillis();
        System.out.println(timeElapsed+ "ms");
    }
}

