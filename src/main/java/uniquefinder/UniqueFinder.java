package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String word) {
        List<Character> characters = new ArrayList<>();
        if (word == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        for (char actual: word.toCharArray()) {
            if (!characters.contains(actual)) {
                characters.add(actual);
            }
        }
        return characters;
    }
}