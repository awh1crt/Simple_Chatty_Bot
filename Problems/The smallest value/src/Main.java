import java.util.Scanner;
import java.util.stream.LongStream;


class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        long N = 20;
        long result = 0;
        long M = scanner.nextLong();

        do {
            result = LongStream.rangeClosed(2,count).reduce(1,Math::multiplyExact);
            count ++;
            } while (result <= M);
        System.out.println(count - 1);

        }



    }


