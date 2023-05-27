import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondTask {
    public static void getSecondTask(String inputString){
        String[] numbersAsString = inputString.split(" ");
        int[] numbers = new int[numbersAsString.length];
        Map <Integer, Integer> freqMap = new HashMap<>();
        List <Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        for (int number : numbers){
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        }

        for (int num : numbers){
            if (freqMap.get(num) > 1){
                result.add(num);
            }
        }

        for (int j = 0; j < result.size(); j++){
            System.out.print(result.get(j) + " ");
        }
    }
}
