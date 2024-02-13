import java.util.Scanner;
import java.util.Random;
// 1 = dirty; 0 = clean; 2 = cleaned
public class Trial5 {
    int[][] Board = createGrid();

    public void run() {
        int guesses = 0;
        Scanner scanner = new Scanner(System.in);

        while (!allClean()) {
            int row = 1;
            int col = 1;
            printGrid();
            System.out.println("Enter row and column to clean (e.g., row NewLINE Collumn): ");
            try {
                row = scanner.nextInt();
                col = scanner.nextInt();
            }
            catch(Exception e){
                System.out.println("Enter the value in two diferent lines using no commas from 1 through 5");
                System.exit(2);
            }

            if (cleanSpot(row - 1, col - 1)) {
                System.out.println("Spot cleaned successfully");
            }
            else {
                System.out.println("Invalid spot or spot is already clean!");
            }

            guesses++;
        }

        System.out.println("You cleaned all the dirty spots in " + guesses + " moves");
        System.exit(0);
    }

    public static int[][] createGrid() {
        int countDirty = 0;
        Random rand = new Random();
        int[][] grid = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (rand.nextInt(0,2) == 1 && countDirty < 5){
                    grid[i][j] = 1;
                    countDirty++;
                }
                else{
                    grid[i][j] = 0;
                }
            }
        }
        return grid;
    }

    public void printGrid() {
        for (int[] row : Board) {
            for (int spot : row) {
                if (spot == 0 || spot == 1) { // Printing clean spots and unknown spots the same
                    System.out.print("O ");
                } else {
                    System.out.print("X "); // Dirty spots are hidden
                }
            }
            System.out.println();
        }
    }
    public boolean allClean() {
        for (int[] row : Board) {
            for (int spot : row) {
                if (spot == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean cleanSpot(int row, int col) {
        try {
            if (row >= 0 && row < Board.length && col >= 0 && col < Board[0].length && Board[row][col] == 1) {
                Board[row][col] = 2;
                return true;
            } else {
                Board[row][col] = 2;
            }
        }
        catch (Exception e){
            System.out.println("Array out of bounds");
            System.exit(5);
        }
        return false;
    }

}
