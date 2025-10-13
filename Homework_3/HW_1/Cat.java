package Homework_3.HW_1;

public class Cat extends Animal {

    private int MaxRun = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRun) {
            System.out.println("Кошка " + name + " пробежал " + distance + " м.");
        }else{
            System.out.println("Кошке столько бегать тяжело. Максимум может пробежать - " + MaxRun + " м.");

        }
        
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не любят плавать!");
    }
     
        
}

    
