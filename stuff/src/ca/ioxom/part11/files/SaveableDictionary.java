package ca.ioxom.part11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveableDictionary {
    private final List<String> translations;
    private final List<String> words;
    private final String filePath;

    public SaveableDictionary() {
        translations = new ArrayList<>();
        words = new ArrayList<>();
        filePath = null;
    }

    public SaveableDictionary(String file) {
        translations = new ArrayList<>();
        words = new ArrayList<>();
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
                for (int i = 0; i < translations.size(); i += 2) {
                    writer.println(words.get(i) + ":" + translations.get(i));
                }

                return true;
            } catch (IOException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public void add(String word, String translation) {
        translations.add(translation);
        words.add(word);
    }

    public String translate(String word) {
        if (translations.contains(word)) {
            return words.get(translations.indexOf(word));
        } else if (words.contains(word)) {
            return translations.get(words.indexOf(word));
        } else {
            return null;
        }
    }

    public void delete(String word) {
        if (translations.contains(word)) {
            words.remove(translate(word));
            translations.remove(word);
        } else if (words.contains(word)) {
            translations.remove(translate(word));
            words.remove(word);
        }
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

        dictionary.add("crob", "hrng");

        if (dictionary.save()) {
            System.out.println("saved");
        }
    }
}
