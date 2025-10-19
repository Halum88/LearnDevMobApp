package Homework_4.HW_2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Иванов", "79998887766");
        pb.add("Петров", "79997776655");
        pb.add("Иванов", "79995554433");
        pb.add("Сидоров", "79994443322");
        pb.add("Макаров", "79993332211");
        pb.add("Врачов", "79992221100");
        pb.add("Грачь", "79994121231");
        pb.add("Сидоров", "79814012235");


        pb.print();

        userIn(pb);


    }

    private static void userIn(PhoneBook pb) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastname = scanner.nextLine();

        if (pb.get(lastname).isEmpty()) {
            System.out.println("Такой фамилии нет в справочнике.");
        } else {
            System.out.println("Телефоны " + lastname + ":");
            for (String phone : pb.get(lastname)) {
                System.out.println(phone);
            }
        }

        scanner.close();
    }
        

}

