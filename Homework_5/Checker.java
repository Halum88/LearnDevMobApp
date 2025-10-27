package Homework_5;

import java.util.Scanner;

public class Checker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод строки: ");
        String input = scanner.nextLine();

        try {
            checkString(input);
            System.out.println("Принято: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkString(String text) throws Exception {
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                throw new Exception("Строка не должна содержать число!");
            }
        }
    }
}
