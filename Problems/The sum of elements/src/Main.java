import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int value;
        int sum = 0;

        do {
            value = scanner.nextInt();
            sum = sum + value;

        } while (value != 0);

        System.out.println(sum);

    }
}