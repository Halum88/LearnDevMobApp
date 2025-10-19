package Homework_4.HW_2;

import java.util.*;

public class PhoneBook implements PBInterface { 

    private Map<String, List<String>> phoneBook = new HashMap<>();


    @Override
    public void add(String lastname, String phone) {
        phoneBook.computeIfAbsent(lastname, k -> new ArrayList<>()).add(phone);

    }

    @Override
    public List<String> get(String lastname) {
        return phoneBook.getOrDefault(lastname, Collections.emptyList());
    }

    public void print() {
        System.out.println("Справочник");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
    
}
