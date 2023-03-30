import java.util.LinkedList;

// Have a class check a word and how it is spelled.

public class WordSwitch {

    public static boolean wordCheck(LinkedList<String> word_list) {
        if (word_list.size() == 0) { // Checks to see if there is anything in the list. If
            return true; // there is not it returns true.
        }

        String new_word;

        for (int i = 0; i < word_list.size(); i++) { // Checks the size of the linked list.
            new_word = "";

            for (int j = 0; j < word_list.get(i).length(); j++) { // Checks the size of the word.
                new_word += (word_list.get(i).substring(word_list.get(i).length() - j)); // Makes the new word.

            }

            if (!word_list.get(i).equals(new_word)) { // Compares both words.
                return false; // Returns false if they are not equal.
            }

        }
        return true; // Returns true depending on if the entire loop was successful.
    }
}