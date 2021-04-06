package ca.ioxom.part11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveableDictionary {
    private final List<String[]> translations;
    private final String filePath;

    public SaveableDictionary() {
        translations = new ArrayList<>();
        filePath = null;
    }

    public SaveableDictionary(String file) {
        translations = new ArrayList<>();
        filePath = file;
    }

    public boolean load() {
        if (filePath != null) {
            try (Scanner fileReader = new Scanner(new File(filePath))) {
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] parts = line.split(":");

                    add(parts[0], parts[1]);
                }

                return true;
            } catch (FileNotFoundException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean save() {
        if (filePath != null) {
            try (PrintWriter writer = new PrintWriter(filePath)) {
                translations.forEach(a -> writer.println(a[0] + ":" + a[1]));
                return true;
            } catch (IOException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public void add(String word, String translation) {
        translations.add(new String[]{word, translation});
    }

    public String translate(String word) {
        for (String[] array : translations) {
            if (array[0].equals(word)) {
                return array[1];
            } else if (array[1].equals(word)) {
                return array[0];
            }
        }

        return null;
    }

    public void delete(String word) {
        for (String[] next : translations) {
            if (contains(next, word)) {
                translations.remove(next);
                break;
            }
        }
    }

    private boolean contains(String[] array, String target) {
        for (final String i : array) {
            if (target.equals(i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SaveableDictionary basicDictionary = new SaveableDictionary();
        System.out.println(basicDictionary.translate("g"));


        SaveableDictionary dictionary = new SaveableDictionary("stuff/src/ca/ioxom/part11/files/words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.delete("apina");
        dictionary.delete("banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));

        dictionary.add("hrng", "crob");

        if (dictionary.save()) {
            System.out.println("saved");
        }
    }
}
