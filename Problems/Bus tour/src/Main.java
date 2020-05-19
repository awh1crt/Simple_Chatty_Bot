import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        List value = new ArrayList();
        boolean crash = false;

        int busHeight = scanner.nextInt();
        int numberBridges = scanner.nextInt();

        for (int i = 0; i < numberBridges; i++) {
           value.add(scanner.nextInt());
        }

        for (int i = 0; i < numberBridges; i++){
            if ((int)value.get(i) > busHeight) {
                continue;
            }
            else if ((int)value.get(i) <= busHeight){
                int bridge = i+1;
                System.out.println("Will crash on bridge " + bridge);
                crash = true;
                break;
            }

        }
        if (crash == false) System.out.println("Will not crash");

    }
}