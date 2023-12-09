import java.util.ArrayList;

/**
 * Клас, що представляє колекцію ключ-значення.
 */
public class KeyValueCollection {
    private ArrayList<KeyValueElement> collection = new ArrayList<>();

    /**
     * Метод для отримання максимальної частоти в колекції.
     *
     * @return Максимальна частота в колекції.
     */
    public int getMaxFrequency() {
        int maxFrequency = 0;
        for (KeyValueElement record : collection) {
            if (record.getValue() > maxFrequency) {
                maxFrequency = record.getValue();
            }
        }
        return maxFrequency;
    }

    /**
     * Метод для додавання елементу до колекції.
     *
     * @param key Ключ для додавання до колекції.
     */
    public void addElement(Word key) {
        for (KeyValueElement element : collection) {
            if (element.getKey().equals(key)) {
                element.incValue();
                return;
            }
        }
        collection.add(new KeyValueElement(key, 1));
    }

    /**
     * Метод для знаходження ключа за значенням.
     *
     * @param value Значення для пошуку.
     * @return Ключ, що відповідає значенню, або null, якщо ключ не знайдено.
     */
    public Word findKeyByValue(int value) {
        for (KeyValueElement element : collection) {
            if (element.getValue() == value) {
                return element.getKey();
            }
        }
        return null;
    }

    /**
     * Метод, що перевіряє, чи вже підраховано слово в колекції.
     *
     * @param uniqueWords Список унікальних слів.
     * @param word        Слово для перевірки.
     * @return true, якщо слово вже підраховано, false - в іншому випадку.
     */
    public static boolean isWordCounted(ArrayList<Word> uniqueWords, Word word) {
        for (Word element : uniqueWords) {
            if (element.equals(word)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод для виведення списку на екран.
     */
    public void printList() {
        System.out.println("| Поле:   | Значення: |");
        System.out.println("—————————————————————");
        for (KeyValueElement word : collection) {
            String formattedLine = String.format("| %-8s |    %d   |", word.getKeyAsStringBuilder(), word.getValue());
            System.out.println(formattedLine);
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }
}
