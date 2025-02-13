package PART6;

import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {
    private Map<String, String> dict;

    public SimpleDictionary() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (word != null && translation != null) {
            this.dict.put(word, translation);
        }
    }

    public String translate(String word) {
        if (this.dict.get(word) == null) {
            return null;
        }

        return this.dict.get(word);
    }
}
