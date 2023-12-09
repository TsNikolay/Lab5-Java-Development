/**
 * Клас, що представляє елемент ключ-значення.
 */
public class KeyValueElement {
    private Word key;
    private int value;

    /**
     * Конструктор класу KeyValueElement.
     *
     * @param field Ключ, який представляє елемент.
     * @param value Значення, яке представляє елемент.
     */
    public KeyValueElement(Word field, int value) {
        this.key = field;
        this.value = value;
    }

    /**
     * Метод для збільшення значення.
     */
    public void incValue() {
        value++;
    }

    /**
     * Метод для отримання ключа у вигляді StringBuilder.
     *
     * @return Ключ у вигляді StringBuilder.
     */
    public StringBuilder getKeyAsStringBuilder() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : this.key.getLetters()) {
            result.append(letter.getLetter());
        }
        return result;
    }

    /**
     * Метод для отримання ключа.
     *
     * @return Ключ.
     */
    public Word getKey() {
        return this.key;
    }

    /**
     * Метод для отримання значення.
     *
     * @return Значення.
     */
    public int getValue() {
        return value;
    }
}
