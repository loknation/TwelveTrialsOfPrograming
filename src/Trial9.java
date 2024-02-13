import java.util.Scanner;

public class Trial9 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive integer:");

        int numPosts = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Demonstrating the fencepost error:");


        System.out.println("Correct way:");
        for (int i = 1; i <= numPosts; i++) {
            System.out.print("Post " + i);
            if (i < numPosts) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Fencepost error: Missing first post
        System.out.println("Fencepost error:");
        for (int i = 2; i <= numPosts; i++) {
            System.out.print("Post " + i);
            if (i < numPosts) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to the next line

        scanner.close();
    }
}
