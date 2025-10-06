package Homework_1;

import java.util.Scanner;

public class HW_1_2 {
// 2 Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void main(String[] args) {

        System.out.println("Please print you name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        scanner.close();

    }
    
}
