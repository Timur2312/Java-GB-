package Lesson_2;

/* Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
выход 4a3b1c2d
 */
public class Exp_2 {
    public static void main(String[] args) {
        String text = "aaaabbbcdd";
        StringBuilder resStr = new StringBuilder();
        int count = 1;
        char inText = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == inText) {
                count+=1;
            }
            else {
                resStr.append(count + Character.toString(inText));
                inText = text.charAt(i);
                count = 1;
            }
        }
        resStr.append(count + Character.toString(inText));
        System.out.println(resStr);
        }
    }

