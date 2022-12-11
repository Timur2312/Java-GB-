package Lesson_2;

/**
 * Exp_3 Проверяет значение палиндром ли или нет
 */
public class Exp_3 {

    public static void main(String[] args) {
        String firstValue = "потоп";
        StringBuilder firstValueBuilder = new StringBuilder(firstValue);
        firstValueBuilder.reverse();
        int count = 0;
        for (int i = 0; i < firstValue.length(); i++) {
            if (firstValue.charAt(i) == firstValueBuilder.charAt(i)) {
                count++;
            }
        }
        if (count == firstValue.length()) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Нет");
        }
     
    }
}