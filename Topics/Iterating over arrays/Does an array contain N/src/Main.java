import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();

        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int element = scanner.nextInt();

        boolean found = false;

        for (int i : array) {
            if (i == element) {
                found = true;
            }
        }
        System.out.println(found);
    }
}