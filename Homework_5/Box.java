package Homework_5;

public class Box<T1, T2, T3> {

    private T1 value1;
    private T2 value2;
    private T3 value3;

    public Box(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void printValues() {
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public double sumNumbers() {
        double sum = 0;

        if (value1 instanceof Number) sum += ((Number) value1).doubleValue();
        if (value2 instanceof Number) sum += ((Number) value2).doubleValue();
        if (value3 instanceof Number) sum += ((Number) value3).doubleValue();

        return sum;
    }

    public static void main(String[] args) {

        Box<String, String, String> box1 = new Box<>("яблоко", "груша", "банан");
        Box<Integer, Integer, Integer> box2 = new Box<>(10, 20, 30);
        Box<Float, Float, Float> box3 = new Box<>(1.5f, 2.5f, 3.0f);

        System.out.println("Коробка 1:");
        box1.printValues();

        System.out.println("\nКоробка 2:");
        box2.printValues();

        System.out.println("\nКоробка 3:");
        box3.printValues();

        System.out.println("\nСумма чисел во второй коробке: " + box2.sumNumbers());
        System.out.println("Сумма чисел в третьей коробке: " + box3.sumNumbers());
    }
}
