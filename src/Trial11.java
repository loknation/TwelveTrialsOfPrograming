import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Trial11 {
    public void run() {
        ArrayList<String> options = new ArrayList<>();
        options.add("🚪");
        options.add("🎭");
        options.add("☕");
        options.add("📦");
        options.add("🎁");

        String apple = "🍎";

        shuffleOptions(options);

        Scanner scanner = new Scanner(System.in);

        while (options.size() > 2) {
            System.out.println("Select one of the following options:");
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            int choice = scanner.nextInt();
            if (choice < 1 || choice > options.size()) {
                System.out.println("z pick a number in range bro");
                continue;
            }

            String selectedOption = options.get(choice - 1);
            if (selectedOption.equals(apple)) {
                System.out.println("you win");
                break;
            } else {
                System.out.println("no");
                options.remove(choice - 1);
                shuffleOptions(options);
            }
        }

    }

    public static void shuffleOptions(ArrayList<String> options) {
        long seed = System.nanoTime(); //No Clue what this does but geeks for geeks said to do it
        Collections.shuffle(options, new Random(seed));
    }
}