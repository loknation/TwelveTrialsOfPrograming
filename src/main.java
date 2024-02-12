import java.util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("What trial do you want to do");
        Scanner Scan = new Scanner(System.in);
        int input = 0;
        try {
            input = Integer.parseInt(Scan.nextLine());
        }
        catch (Exception E){
            System.out.println("Enter a Number");
            System.exit(1);
        }
        if (input == 1){
            Trial1 Trial = new Trial1();
            Trial.run();
        }
        else if (input == 2){
            System.out.println("Under Development");
        }
        else if (input == 3){
            Trial3 Trial = new Trial3();
            Trial.run();
        }
        else if (input == 4){
            System.out.println("Under Development");
        }
        else if (input == 5){
            System.out.println("Under Development");
        }
        else if (input == 6){
            System.out.println("Under Development");
        }
        else if (input == 7){
            System.out.println("Under Development");
        }
        else if (input == 8){
            System.out.println("Under Development");
        }
        else if (input == 9){
            System.out.println("Under Development");
        }
        else if (input == 10){
            System.out.println("Under Development");
        }
        else if (input == 11){
            System.out.println("Under Development");
        }
        else if (input == 12){
            System.out.println("Under Development");
        }

    }
}
