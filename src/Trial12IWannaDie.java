import java.util.Random;
import java.util.Scanner;
//1 = serb; 0 = notserb; 2 = blocked
public class Trial12IWannaDie {
    public void run() {
        final int SIZE = 10;
        int[][] grid = createGrid();
        int cerberusRow, cerberusCol, guessRow, guessCol;
        boolean cerberusFound = false;

        cerberusRow = -1;
        cerberusCol = -1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 1) {
                    cerberusRow = i;
                    cerberusCol = j;
                    break;
                }
            }
            if (cerberusRow != -1) break;
        }

        Scanner scanner = new Scanner(System.in);

        while (!cerberusFound) {
            printGrid(grid, SIZE);

            System.out.print("Enter row (0-9) ");
            guessRow = scanner.nextInt();
            System.out.print("Enter column (0-9) ");
            guessCol = scanner.nextInt();

            if (guessRow == cerberusRow && guessCol == cerberusCol) {
                cerberusFound = true;
                System.out.println("you won");
            } else {
                System.out.println("nope");
                grid[guessRow][guessCol] = 2;

                int[] newLocation = moveSerb(cerberusRow, cerberusCol, grid);
                cerberusRow = newLocation[0];
                cerberusCol = newLocation[1];
            }
        }

        scanner.close();
    }
    public static int[][] createGrid() { //coppied from 5 cuz im lazy
        Random rand = new Random();
        int[][] grid = new int[10][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    grid[i][j] = 0;
            }
        }
        grid[rand.nextInt(0,10)][rand.nextInt(0,10)] = 1;
        return grid;
    }
    public static void printGrid(int[][] grid, int size) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] == 2 ? "x " : "o" + " ");
            }
            System.out.println();
        }
    }
    public static int[] moveSerb(int cerberusRow, int cerberusCol, int[][] grid) {
        Random rand = new Random();
        int[] newLocation = {cerberusRow, cerberusCol};


        int[][] possibleMoves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int attempts = 0;
        while (attempts < possibleMoves.length) {
            int[] move = possibleMoves[rand.nextInt(possibleMoves.length)];
            int newRow = cerberusRow + move[0];
            int newCol = cerberusCol + move[1];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] != 2) { //check is valid move also not guessed
                newLocation[0] = newRow;
                newLocation[1] = newCol;
                return newLocation;
            }
            attempts++;
        }
        return null;
    }
}
