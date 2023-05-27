import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTask {
    public static void getFirstTask(String inputString){
        // Используем регулярное выражение для поиска всех чисел в строке
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();

        // Перебираем все числа в строке и находим минимальное, максимальное и сумму
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            minNumber = Math.min(minNumber, number);
            maxNumber = Math.max(maxNumber, number);
            sum += number;
            nums.add(number);
        }
        //заполнение массива nums числами из строки inputString и его вывод
        int size = nums.size();
        System.out.print("ArrayList: ");
        for (int i = 0; i < size; i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        // Выводим результаты
        System.out.println("Минимальное число: " + (minNumber == Integer.MAX_VALUE ? 0 : minNumber));
        System.out.println("Максимальное число: " + (maxNumber == Integer.MIN_VALUE ? 0 : maxNumber));
        System.out.println("Сумма всех чисел: " + sum);
    }
}
