/**
 * Клас, що представляє знак пунктуації.
 * Реалізує інтерфейс PrintableElement.
 */
public class Punctuation implements PrintableElement {
    private char punctuationMark;

    /**
     * Конструктор класу Punctuation.
     *
     * @param punctuationMark Знак пунктуації, який представляє об'єкт.
     */
    public Punctuation(char punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    /**
     * Метод для виведення знаку пунктуації на екран.
     */
    @Override
    public void print() {
        System.out.print(punctuationMark);
    }
}
