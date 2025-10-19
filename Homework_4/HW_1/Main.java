package Homework_4.HW_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] words = {
            "кот", "собака", "дом", "кот", "машина", "солнце",
            "река", "дом", "лес", "собака", "река", "небо",
            "машина", "кошка", "дом", "река", "дом", "солнце"
        };
    
        unique(words);
    
        countUnique(words);
    
    }


    private static void unique(String[] words) {

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

    }



    private static void countUnique(String[] words) {

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }else{
                wordCount.put(word, 1);
            }
        }

        System.out.println();

        System.out.println(wordCount.entrySet());
        
    }

}
