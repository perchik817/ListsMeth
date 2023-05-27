import java.util.*;

public class SixthTask {
    public static void getSixthTask(String inputString){
        String[] words = inputString.split(" ");

        // Отбрасываем слова, содержащие небуквенные символы
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                filteredWords.add(word);
            }
        }

        // Сортируем слова в порядке возрастания
        Collections.sort(filteredWords);

        // Выводим слова на экран
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }
}
