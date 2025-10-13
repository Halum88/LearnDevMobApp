package Homework_3.HW_1;

public class Dog extends Animal{

    private int MaxRun = 500;
    private int MaxSwim  = 10;
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRun) {
            System.out.println("Собака " + name + " пробежала " + distance + " м.");
        }else{
            System.out.println("Собаке столько бегать тяжело. Максимум может пробежать - " + MaxRun + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MaxSwim) {
            System.out.println("Собака " + name + " проплыла " + distance + " м.");
        }else{
            System.out.println("Собаке тяжело столько проплыть. Максимум может проплыть - " + MaxSwim + " м.");
        }

    }


}
