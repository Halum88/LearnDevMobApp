package Homework_3.HW_2;

public class Main {

    // Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата и возраст. 
    // Конструктор класса должен заполнять эти поля при создании объекта. 
    // Написать метод в этом классе, который выводит информацию об объекте в консоль в виде красиво оформленной строки. 
    // Создать массив из 5 сотрудников и с помощью цикла foreach вывести информацию только о сотрудниках старше 40 лет
    
    public static void main(String[] args) {

        Staff[] staffs = new Staff[] {

        new Staff("Ivanov Ivan Ivanovich", "Director", "ivanovich@mail.com", "7(999)888-77-66", 100000, 37),
        new Staff("Petrov Petr Petrovich", "Manager", "petrov@mail.com", "7(999)777-66-55", 80000, 42),
        new Staff("Sidorov Sidor Sidorovich", "Accountant", "sidorov@mail.com", "7(999)666-55-44", 70000, 29),
        new Staff("Smirnova Anna Sergeevna", "HR", "smirnova@mail.com", "7(999)555-44-33", 65000, 31),
        new Staff("Kuznetsov Alexey Vladimirovich", "Developer", "kuznetsov@mail.com", "7(999)444-33-22", 90000, 66)

        };

        int count = 0;
        for (Staff staff : staffs) {
            if (staff.age > 40) {
                count++;
                staff.printInfo();
            }
        }
        System.out.println("Сотрудников в компании старше 40 лет: " + count);
        
        System.out.println("Общее количество сотрудников в компании: " + Staff.amountOfStaff);
        
        // вывод всех сотрудников
        // for (Staff staff : staffs) {
        //     staff.printInfo();
        // }


    }
    
}
