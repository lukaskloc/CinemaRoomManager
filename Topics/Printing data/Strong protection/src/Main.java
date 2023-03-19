class Main {
    public static void main(String[] args) {
        //write your code here
        String[][] array = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print(array[i][array[i].length - 1]);
            System.out.println();
        }
    }
}