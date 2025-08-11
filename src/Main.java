import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] table = {
                {20, 50, 10},
                {80, 25, 15},
                {60, 100, 35},
                {40, 75, 45}
        };

        // Nested loop to print all elements in the table
        System.out.println("Table values:");
        for (int i = 0; i < table.length; i++) { // rows
            for (int j = 0; j < table[i].length; j++) { // columns
                System.out.print(table[i][j] + "\t");
            }
            System.out.println(); // new line after each row
        }

        scanner.close();
    }
}
