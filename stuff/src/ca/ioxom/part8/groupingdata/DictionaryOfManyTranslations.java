package ca.ioxom.part8.groupingdata;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private final HashMap<String, ArrayList<String>> translations;
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            ArrayList<String> translationAsList = new ArrayList<>();
            translationAsList.add(translation);
            this.translations.put(word, translationAsList);
        } else {
            ArrayList<String> currentTranslationsOfWord = new ArrayList<>(this.translations.get(word));
            currentTranslationsOfWord.add(translation);
            this.translations.put(word, currentTranslationsOfWord);
        }
    }

    public ArrayList<String> translate(String word) {
        if (!this.translations.containsKey(word)) return new ArrayList<>();
        return new ArrayList<>(this.translations.get(word));
    }

    public void remove(String word) {
        this.translations.remove(word);
    }

    public static void main(String[] arrgs) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
