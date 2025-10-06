package Homework_1;

import java.util.Scanner;

public class HW_1_4 {
// 4 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.

    public static void main(String[] args) {

        System.out.println("Print number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
        } else if (number > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число равно нулю");
        }
        scanner.close();
    }
}


        
