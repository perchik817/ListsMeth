import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SeventhTask {
    public static void getSeventhTask(String inputString){
        String[] words = inputString.split(" ");
        List<String> startWithVow = new ArrayList<>();
        List<String> startWithCon = new ArrayList<>();
        String vowels = "аиеёоуыэюя";
        for(String word : words){
            //for(int i = 0; i < word.length(); i++){
                if(word.charAt(0) == vowels.charAt()){
                    startWithVow.add(word);
                }else{
                    startWithCon.add(word);
                }
            //}
        }
        for(int j = 0; j < startWithVow.size(); j++){
            System.out.println(startWithVow.get(j));
        }
        System.out.println();
        for(int k = 0; k < startWithCon.size(); k++){
            System.out.println(startWithCon.get(k));
        }
    }
    public static int index(String str) {
        int index;
        for(index = 0; index < str.length(); index++){
            return str.charAt(index);
        }
        return index;
    }
}
