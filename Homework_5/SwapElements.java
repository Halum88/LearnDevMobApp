package Homework_5;

public class SwapElements {

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        String[] words = {"кот", "собака", "тигр", "лев"};
        swap(words, 1, 3); 

        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 0, 4);

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
