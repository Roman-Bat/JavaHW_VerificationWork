package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Создаем телефонную книгу
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавляем записи в телефонную книгу
        addContact(phoneBook, "Иванов", "123-456-789");
        addContact(phoneBook, "Петров", "987-654-321");
        addContact(phoneBook, "Иванов", "111-222-333");
        addContact(phoneBook, "Сидоров", "555-666-777");
        addContact(phoneBook, "Петров", "444-555-666");

        // Выводим отсортированный результат
        printSortedPhoneBook(phoneBook);

    }

    // Метод для добавления контакта в телефонную книгу
    private static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {

        // Если имя уже есть в книге, добавляем телефон к существующему списку
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        }
        else {
            // Иначе создаем новую запись
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    // Метод для вывода отсортированной телефонной книги по убыванию числа телефонов
    private static void printSortedPhoneBook(Map<String, List<String>> phoneBook) {
        // Создаем список записей (имя и количество телефонов) для сортировки
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

        // Сортируем список по убыванию количества телефонов
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Выводим отсортированный результат
        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers.size() + " телефон(ов) - " + phoneNumbers);
        }
    }
}