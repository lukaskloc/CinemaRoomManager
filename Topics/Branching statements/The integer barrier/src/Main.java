import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += number;
                if (sum >= 1000) {
                    System.out.println(sum - 1000);
                    break;
                }
            }
        }
    }
}