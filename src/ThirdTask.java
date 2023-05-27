import java.util.ArrayList;
import java.util.List;

public class ThirdTask {
    public static void getThirdTask(String inputstring){
        String[] without = inputstring.split(",");
        int[] nums = new int[without.length];
        List <Integer> oddNums = new ArrayList<>(); //num % 2 != 0
        List <Integer> evenNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(without[i]);
        }

        for (int num : nums){
            if (num % 2 == 0){
                evenNums.add(num);
            }else{
                oddNums.add(num);
            }
        }

        for (int num : oddNums){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : evenNums){
            System.out.print(num + " ");
        }
    }
}
