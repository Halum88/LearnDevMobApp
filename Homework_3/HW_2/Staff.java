package Homework_3.HW_2;

public class Staff {
    static int amountOfStaff;

    private String fullName;   // ФИО
    private String position;   // должность
    private String email;      // email
    private String phone;      // телефон
    private double salary;     // зарплата
    public int age;           // возраст

    
    public Staff (String fullName, String position, String email, String phone, double salary, int age){

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        amountOfStaff++;

    }


    public void printInfo() {
        System.out.println("───────────────────────────────");
        System.out.println("Сотрудник: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary + " руб.");
        System.out.println("Возраст: " + age + " лет");
        System.out.println("───────────────────────────────");
    }

}
