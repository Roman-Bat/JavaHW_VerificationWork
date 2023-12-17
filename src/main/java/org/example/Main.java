package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Создаем телефонную книгу
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавляем записи в телефонную книгу
        addContact(phoneBook, "Иванов", "123-456-789");

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

    }
}