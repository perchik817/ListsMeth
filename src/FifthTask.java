import java.util.Arrays;

public class FifthTask {
    public static void getFifthTask(String inputstring){
        String[] string;
        int ind = inputstring.indexOf("#");

        if(ind != -1){
            inputstring = inputstring.substring(0, ind) + inputstring.substring(ind + 1);
        }
        System.out.println(inputstring);

        String[] words = inputstring.split("\\s+");
        String longestWord = Arrays.stream(words)
                .max((w1, w2) -> w1.length() - w2.length())
                .orElse("");
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
