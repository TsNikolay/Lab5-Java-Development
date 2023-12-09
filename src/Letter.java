/**
 * Клас, що представляє букву в слові.
 */
public class Letter {
    private char letter;

    /**
     * Конструктор класу Letter.
     *
     * @param letter Буква, яку представляє об'єкт.
     */
    public Letter(char letter) {
        this.letter = letter;
    }

    /**
     * Метод, що повертає букву.
     *
     * @return Буква, представленням об'єкта.
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Метод для виведення букви на екран.
     */
    public void print() {
        System.out.print(letter);
    }
}
