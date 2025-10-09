package Homework_2;

import java.util.Scanner;

public class HW2 {
//  Написать консольную игру “угадай число”. Рандомно генерируем число от 0 до 10. Пользователю дается 3 попытки угадать его. 
// При каждой попытке компьютер должен сообщить, больше или меньше загаданное число. 
// * После победы /проигрыша выводится запрос: “Повторить игру еще раз? 1 - да/0 - нет” (1 - повторить, 0 - нет)
    public static void main(String[] args) {

            userCheck();

    }

    private static void userCheck() {
        boolean playAgain;      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую в консольной игре “угадай число” от 0 до 10! У вас 3 попытки. ");
 
        do { 
            int number = (int) (Math.random() * 11);
            // System.out.println(number); // для проверки

            int count = 3;
            
            while (count > 0) {
                System.out.println("Введите число: ");
                int num = scanner.nextInt();
                System.out.println(" ");

                if (num > number) {
                    count --;
                    System.out.println("Неверно: Ваше число больше задуманного. Осталось попыток " + count);
            
                }else if (num < number) {
                    count --;
                    System.out.println("Неверно: Ваше число меньше задуманного. Осталось попыток " + count);
                
                }else {
                    System.out.println("Верно: Загаданное число " + number + "!");
                    break;
                }
                
            }

        if (count == 0) {
                System.out.println(" ");
                System.out.println("Вы проиграли! Загаданное число было: " + number);
        }
        System.out.println(" ");
        System.out.println("Хотите сыграть ещё раз? (1 — да / 0 — нет)");
        int choice = scanner.nextInt();

        playAgain = (choice == 1);    
 
        
        } while (playAgain);

        System.out.println("Спасибо за игру!");
        scanner.close();
        
    }
   
}
