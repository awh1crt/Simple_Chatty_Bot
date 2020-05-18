import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();

        for (int i = 0; i < elements; i++){

            int number = scanner.nextInt();
            if (number % 6 == 0){
                total += number;
            }

        }
        System.out.print(total);

    }
}