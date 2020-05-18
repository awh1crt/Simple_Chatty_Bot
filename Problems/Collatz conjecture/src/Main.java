import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int number = scanner.nextInt();
        result = number;
        System.out.print(number +" ");
        while (result != 1) {
            if (result % 2 == 0) {
                result = result / 2;
                System.out.print(result + " ");
            } else {
                result = ((result * 3) + 1);
                System.out.print(result +" ");

            }

        }


    }
}
