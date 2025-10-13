import java.util.Scanner;

public class learn_2 {
    public static void main(String[] args) {


        int summ = 0;
        for (int a = 0; a <= 100; a++) {
            summ += a;
        }

        System.out.println("Summa" + summ);







        // int i = 1000;
        // while (i >= 0) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        //     i--;
        // }
        // System.out.println(("цикл завершен"));
        






        // switchMethod();
        // ifMethod();
        // conditioning();


    }

    private static void conditioning(){
        boolean isHost = false;
        if(isHost) {
            System.out.println("cooling");
        } else {
            System.out.println("No cooling");
        }
    }

    private static void ifMethod(){
        System.out.println("Enter number from 1 to 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number == 1) {
            System.out.println("1");
        }
        if(number == 2) {
            System.out.println("2");
        }
        if(number == 3) {
            System.out.println("3");
        }
        if(number == 4) {
            System.out.println("4");
        }
        if(number == 5) {
            System.out.println("5");
        }
        else{
            System.out.println("Error number: Please 1 to 5!");
        }
        scanner.close();
    }

    private static void switchMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
        
            default:
            System.out.println("Error number: Please 1 to 5!");
                break;
        
        
        }

        scanner.close();
    }

}
    


