import java.util.Scanner;
public class Trial3 {
    public static String ConvertTime(double Time){
        int hours = (int) Time;
        int minutes = (int) ((Time - hours) * 60);
        int seconds = (int) (((Time - hours) * 60 - minutes) * 60);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds); //d means for type int. 02 means two digits with zeros padding. ":" separates string literals.
    }
    public void run(){
        double distance = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("How far are you traveling in miles");
        try{
            distance = Scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Please enter a number");
            System.exit(1);
        }
        System.out.println("If you travel at 80mph it will take you " + ConvertTime(distance / (80)));
    }
}
