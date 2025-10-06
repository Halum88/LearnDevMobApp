package Homework_1;

public class HW_1_5 {
// 5 Написать метод, который выводит последовательность чисел от 1000 до 0, кратных 3

    public static void main(String[] args) {

        for (int num = 1000; num >= 0; num--){
            if (num % 3 == 0){
                System.out.print(num + " ");
            }
        }
    }

}

