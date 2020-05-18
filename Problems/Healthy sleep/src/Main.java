import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String H = scanner.nextLine();

        if ( Integer.parseInt(H) >=  Integer.parseInt(A) ){
            if ( Integer.parseInt(H) > Integer.parseInt(B)) {
                System.out.println("Excess");
            }
                else {

                    System.out.println("Normal");
                }


            }
        else if (Integer.parseInt(H) <Integer.parseInt(A)) {
            System.out.println("Deficiency");
            }

        }
    }
