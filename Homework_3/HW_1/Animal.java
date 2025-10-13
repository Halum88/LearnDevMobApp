package Homework_3.HW_1;

abstract class Animal {

    String name;
    static int amountOfAnimal;

    public Animal(String name) { 
        this.name = name;
        amountOfAnimal++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);


}
    
