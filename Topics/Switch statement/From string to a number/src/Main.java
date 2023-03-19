import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String number = scanner.next();
        if (number.equals("one")) {
            System.out.println(1);
        } else if (number.equals("two")) {
            System.out.println(2);
        } else if(number.equals("three")) {
            System.out.println(3);
        } else if(number.equals("four")) {
            System.out.println(4);
        } else if(number.equals("five")) {
            System.out.println(5);
        } else if(number.equals("six")) {
            System.out.println(6);
        } else if(number.equals("seven")) {
            System.out.println(7);
        } else if(number.equals("eight")) {
            System.out.println(8);
        } else if(number.equals("nine")) {
            System.out.println(9);
        }
    }
}