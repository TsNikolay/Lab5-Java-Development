import java.util.ArrayList;

/**
 * Клас, що представляє слово.
 * Реалізує інтерфейс PrintableElement.
 */
public class Word implements PrintableElement {
    private ArrayList<Letter> letters = new ArrayList<>();

    /**
     * Конструктор класу Word.
     *
     * @param word Слово у вигляді StringBuilder.
     */
    public Word(StringBuilder word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            letters.add(new Letter(letter));
        }
    }

    /**
     * Метод для отримання букви за індексом у слові.
     *
     * @param index Індекс букви у слові.
     * @return Буква за вказаним індексом.
     */
    public char getLetter(int index) {
        return letters.get(index).getLetter();
    }

    /**
     * Метод для отримання списку букв у слові.
     *
     * @return Список букв у слові.
     */
    public ArrayList<Letter> getLetters() {
        return letters;
    }

    /**
     * Метод для порівняння слова з іншим словом.
     *
     * @param otherWord Інше слово для порівняння.
     * @return true, якщо слова рівні, false - в іншому випадку.
     */
    public boolean equals(Word otherWord) {
        if (this.letters.size() != otherWord.letters.size()) {
            return false;
        }

        for (int i = 0; i < this.letters.size(); i++) {
            if (this.getLetter(i) != otherWord.getLetter(i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Метод для виведення слова на екран.
     */
    @Override
    public void print() {
        for (Letter letter : letters) {
            letter.print();
        }
    }
}
