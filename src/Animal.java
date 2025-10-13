abstract public class Animal {
    String name;
    int age;
    int legs;
    boolean tail;

    public Animal(String name, int age, int legs, boolean tail) {
        
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.tail = tail;
        
    }

    void printInfo(){
        System.out.printf("This %s is %s years old and %s and %s \n", name, age, legs, tail);


    }
    
}


