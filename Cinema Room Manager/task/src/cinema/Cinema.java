package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();
        int totalNumberOfSeats = numberOfRows * numberOfSeats;
        String[][] cinema = new String[numberOfRows + 1][numberOfSeats + 1];

        double numberOfPurchaseSeatsPercentage = 0.00;
        int currentIncome = 0;

        int totalIncome;
        if (totalNumberOfSeats <= 60) {
            totalIncome = totalNumberOfSeats * 10;
        } else { totalIncome = numberOfRows / 2 * numberOfSeats * 10 +
                (numberOfRows / 2 + 1) * numberOfSeats * 8;
        }

        cinema[0][0] = " ";
        for (int i = 1; i < cinema[0].length; i++) {
            cinema[0][i] = String.valueOf(i);
        }
        for (int i = 1; i < cinema.length; i++) {
            cinema[i][0] = String.valueOf(i);
            for (int j = 1; j < cinema[i].length; j++) {
                cinema[i][j] = "S";
            }
        }

        int numberOfPurchasedSeats = 0;

        while (true) {

            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                printSeats(cinema);
            } else if (choice == 2) {
                while (true) {
                    System.out.println();
                    System.out.println("Enter a row number:");
                    int selectedRow = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int selectedSeat = scanner.nextInt();
                    int ticketPrice;

                    if (selectedRow <= numberOfRows && selectedSeat <= numberOfSeats) {
                        if (!cinema[selectedRow][selectedSeat].equals("B")) {
                            if (totalNumberOfSeats <= 60) {
                                ticketPrice = 10;
                            } else {
                                if (selectedRow <= numberOfRows / 2) {
                                    ticketPrice = 10;
                                } else {
                                    ticketPrice = 8;
                                }
                            }
                            currentIncome += ticketPrice;
                            System.out.println();
                            System.out.println("Ticket Price: $" + ticketPrice);
                            cinema[selectedRow][selectedSeat] = "B";
                            numberOfPurchasedSeats++;
                            numberOfPurchaseSeatsPercentage = (double) numberOfPurchasedSeats / totalNumberOfSeats * 100.00;
                            break;
                        } else {
                            System.out.println();
                            System.out.println("That ticket has already been purchased!");
                        }
                    } else {
                        System.out.println("Wrong input!");
                    }
                }
                } else if (choice == 3) {
                    showStatistics(totalIncome, numberOfPurchasedSeats, currentIncome, numberOfPurchaseSeatsPercentage);
                } else if (choice == 0) {
                    break;
                }
        }
    }

    private static void printSeats(String[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (String[] strings : cinema) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }

    private static void showStatistics(int income, int seats, int currentInc, double seatsPercentage) {
        System.out.println();
        System.out.println("Number of purchased tickets: " + seats);
        System.out.println("Percentage: " + String.format("%.2f", seatsPercentage) + "%");
        System.out.println("Current income: $" + currentInc);
        System.out.println("Total income: $" + income);
    }
}
