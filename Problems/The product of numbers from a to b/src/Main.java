import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        long product = 1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i < b; i++){
            product *= i;
        }
        System.out.println(product);
    }
}