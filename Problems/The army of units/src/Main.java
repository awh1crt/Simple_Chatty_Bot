import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        if (count < 1) System.out.println("no army");
        else if (count <= 19) System.out.println("pack");
        else if (count <= 249) System.out.println("throng");
        else if (count <= 999) System.out.println("zounds");
        else System.out.println("legion");

    }
}