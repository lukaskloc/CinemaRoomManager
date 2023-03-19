import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
    long theFirstNumber = scanner.nextLong();
    String operation = scanner.next();
    long theSecondNumber = scanner.nextLong();

    switch (operation) {
        case "+":
            System.out.println(theFirstNumber + theSecondNumber);
            break;
        case "-":
            System.out.println(theFirstNumber - theSecondNumber);
            break;
        case "/":
            if (theSecondNumber == 0) {
                System.out.println("Division by 0!");
            } else {
                System.out.println(theFirstNumber / theSecondNumber);
            }
            break;
        case "*":
            System.out.println(theFirstNumber * theSecondNumber);
            break;
        default:
            System.out.println("Unknown operator");
            break;
    }
    }
}