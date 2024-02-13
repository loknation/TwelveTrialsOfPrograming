import java.util.Scanner;
public class main {
    public static void main(String[] args){
        try {
            System.out.println("What trial do you want to do");
            Scanner Scan = new Scanner(System.in);
            int input = 0;
            try {
                input = Integer.parseInt(Scan.nextLine());
            } catch (Exception E) {
                System.out.println("Enter a Number");
                System.exit(1);
            }
            if (input == 1) {
                Trial1 Trial = new Trial1();
                Trial.run();
            } else if (input == 2) {
                Trial2 Trial = new Trial2();
                Trial.run();
            } else if (input == 3) {
                Trial3 Trial = new Trial3();
                Trial.run();
            } else if (input == 4) {
                Trial4 Trial = new Trial4();
                Trial.run();
            } else if (input == 5) {
                Trial5 Trial = new Trial5();
                Trial.run();
            } else if (input == 6) {
                System.out.println("Under Development");
            } else if (input == 7) {
                Task7 Trial = new Task7();
                Trial.run();
            } else if (input == 8) {
                System.out.println("Under Development");
            } else if (input == 9) {
                System.out.println("Under Development");
            } else if (input == 10) {
                Trial10 Trial = new Trial10();
                Trial.run();
            } else if (input == 11) {
                Trial11 Trial = new Trial11();
                Trial.run();
            } else if (input == 12) {
                Trial12IWannaDie Trial = new Trial12IWannaDie();
                Trial.run();
            }
        }
        catch (Exception e){
            System.out.print("you cought my big loop bc I started running out of time to bullet proof: screw you");
        }
    }
}
