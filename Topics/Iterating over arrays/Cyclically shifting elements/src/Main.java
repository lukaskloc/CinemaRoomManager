import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int[] temp = Arrays.copyOf(array, arraySize);

        for (int i = 1; i < temp.length; i++) {
            array[i] = temp[i - 1];
        }
        array[0] = temp[temp.length - 1];

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}