package Homework_1;

import java.util.Scanner;

public class HW_1_3 {
// 3 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static void main(String[] args) {

        System.out.println("Print number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("true");
        } else if (number > 0) {
            System.out.println("false");
        } else {
            System.out.println("Number exactly zero");
        }

        scanner.close();

    }
    
}
