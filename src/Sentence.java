import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Клас, що представляє речення в тексті.
 */
public class Sentence {
    private ArrayList<PrintableElement> sentenceElements = new ArrayList<>();

    /**
     * Конструктор класу Sentence.
     *
     * @param sentenceValue Рядок, який представляє речення.
     */
    public Sentence(StringBuilder sentenceValue) {
        // регулярний вираз, який розбиває речення на слова, пробіли та знаки пунктуації
        Pattern WORD_PATTERN = Pattern.compile("\\b\\w+\\b|\\s+|\\p{Punct}");
        Matcher matcher = WORD_PATTERN.matcher(sentenceValue);
        ArrayList<StringBuilder> elements = new ArrayList<>();

        while (matcher.find()) {
            StringBuilder element = new StringBuilder(matcher.group());
            elements.add(element);
        }

        for (StringBuilder element : elements) {
            if (Character.isLetter(element.charAt(0))) {
                this.sentenceElements.add(new Word(element));
            } else {
                char punctuationMark = element.charAt(0);
                this.sentenceElements.add(new Punctuation(punctuationMark));
            }
        }
    }

    /**
     * Метод для отримання списку слів у реченні.
     *
     * @return Список слів у реченні.
     */
    public ArrayList<Word> getWords() {
        ArrayList<Word> result = new ArrayList<>();

        for (PrintableElement element : sentenceElements) {
            if (element instanceof Word wordElement) {
                result.add(wordElement);
            }
        }
        return result;
    }
}
