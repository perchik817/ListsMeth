public class FourthTask {
    public static void getThirdTask(String inputString){
        char[] letters = inputString.toCharArray();
        int letterCount = 1;
        char errorLetter = ' ';
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                letterCount++;
                if (letterCount > 3){
                    letterCount = 1;
                }
                if (letterCount > 2) {
                    errorLetter = letters[i];
                }
            } else {
                letterCount = 1;
            }
        }

        if (errorLetter == ' ') {
            System.out.println("Не могу исправить");
        } else {
            String correctedWord = inputString.replace(errorLetter + String.valueOf(errorLetter), String.valueOf(errorLetter));
            System.out.printf("Буква \"%c\" ошибочно повторяется %d раз(а)%n", errorLetter, letterCount);
            System.out.printf("Исправленное слово: %s%n", correctedWord);
        }
    }
}
