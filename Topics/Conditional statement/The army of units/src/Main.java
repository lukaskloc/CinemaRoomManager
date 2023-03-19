import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int armyQuantity = scanner.nextInt();
        if (armyQuantity < 1) {
            System.out.println("no army");
        } else if (armyQuantity <= 19) {
            System.out.println("pack");
        } else if (armyQuantity <= 249) {
            System.out.println("throng");
        } else if (armyQuantity <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}