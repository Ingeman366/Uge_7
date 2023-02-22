package prime;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PrimeTest {
    public static void main(String[] args) {
        Instant i6 = Instant.now();
        List<Long> list = new ArrayList<>();
        list.add(900000923L);
        list.add(900001829L);
        list.add(900002641L);
        list.add(900003427L);
        isPrime(list);
        Instant i7 = Instant.now();
        System.out.println("Total time elapsed: " + Duration.between(i6, i7));
    }   public static void isPrime(List<Long> list){
        for (Long longint:list) {
            Instant i1 = Instant.now();
            boolean isPrime = true;
            Instant i3 = null;
            for (long i = 2; i < longint; i++) {
                if (longint % i == 0) {
                    isPrime = false;
                    i3 = Instant.now();
                    break;
                }
            }
            if (isPrime) {
                i3 = Instant.now();
                System.out.println(longint + " is a prime number and it took:");
                System.out.println(Duration.between(i1, i3));
                System.out.println("seconds to calculate\n");
            } else{
                System.out.println(longint + " is NOT a prime number and it took:");
                System.out.println(Duration.between(i1, i3));
                System.out.println("seconds to calculate\n");
            }
        }
    }
}
