import java.util.Scanner;
public class Trial4 {
    public void run(){
        double snowfall = 0;
        System.out.println("how many inches of snow per hour are you reciving");
        Scanner Scan = new Scanner(System.in);
        try{
            snowfall = Scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Enter a number");
            System.exit(2);
        }
        System.out.println(snowfall * 24 / 12 > 8 ? "The Boar has been cought in snow" : snowfall * 24/12 + "feet");

    }
}
