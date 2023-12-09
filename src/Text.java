import java.util.ArrayList;

/**
 * Клас, що представляє текст та виконує обробку речень.
 */
public class Text {
    private ArrayList<Sentence> sentences = new ArrayList<>();

    /**
     * Конструктор класу Text.
     *
     * @param text Текст у вигляді StringBuilder.
     */
    public Text(StringBuilder text) {
        ArrayList<Integer> separatorsIndices = getListOfSeparatorsIndices(text);
        divideTextOnSentences(text, separatorsIndices);
    }

    /**
     * Метод для отримання списку індексів роздільників у тексті.
     *
     * @param text Текст у вигляді StringBuilder.
     * @return Список індексів роздільників у тексті.
     */
    public ArrayList<Integer> getListOfSeparatorsIndices(StringBuilder text) {
        ArrayList<Integer> separatorsIndices = new ArrayList<>();
        separatorsIndices.add(0);

        for (int i = 0; i < text.length() - 1; i++) {
            char symbol = text.charAt(i);
            if (symbol == '.' || symbol == '!' || symbol == '?') {
                if (i + 1 < text.length() && text.charAt(i + 1) == ' ') {
                    separatorsIndices.add(i + 2);
                }
            }
        }

        separatorsIndices.add(text.length());
        return separatorsIndices;
    }

    /**
     * Метод для розділення тексту на речення.
     *
     * @param text             Текст у вигляді StringBuilder.
     * @param separatorsIndices Список індексів роздільників у тексті.
     */
    public void divideTextOnSentences(StringBuilder text, ArrayList<Integer> separatorsIndices) {
        for (int i = 0; i < separatorsIndices.size() - 1; i++) {
            int sentenceStart = separatorsIndices.get(i);
            int sentenceEnd = Math.min(separatorsIndices.get(i + 1), text.length());
            StringBuilder sentenceValue = new StringBuilder(text.substring(sentenceStart, sentenceEnd));
            Sentence sentence = new Sentence(sentenceValue);
            sentences.add(sentence);
        }
    }

    /**
     * Метод для отримання списку речень у тексті.
     *
     * @return Список речень у тексті.
     */
    public ArrayList<Sentence> getSentences() {
        return sentences;
    }
}
