import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list_words = new LinkedList<String>();
        list_words.add("wow");
        list_words.add("more");
        System.out.println(WordSwitch.wordCheck(list_words));
    }

}
