public class Trial10 {
    public void run(){
        int position = 0;
        boolean moveRight = true;
        while (true) {
            for (int i = 0; i < position; i++) {
                System.out.print(" ");}
            System.out.println("\u1F6F8");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (moveRight) {
                position++;
                if (position >= 20) {
                    moveRight = false;}} else {
                position--;
                if (position <= 0) {
                    moveRight = true;}}}}}
