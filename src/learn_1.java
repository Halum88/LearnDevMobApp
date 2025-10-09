import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // byte a = 100;
        // short b, c, d;
        // b = 400;
        // c = 500;
        // d = 600;

        // System.out.println(a);
        // System.out.println();
        // System.out.println(c);
        
        // char symbol = '$';
        // System.out.println(symbol);
        // calculateSecondsFromUser()

        System.out.println("Enter amount of seconds: ");

        Scanner sc = new Scanner(System.in);
        int secondsFromUser = sc.nextInt();
        int days = (secondsFromUser / 60 / 60 / 24);
        int hours = (secondsFromUser / 60 / 60) % 24;
        int minutes = (secondsFromUser / 60) % 60;
        int seconds = secondsFromUser % minutes;
        
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        
        

    }
    
}

