package Lesson_1;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 * В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
 */
public class Exp_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = in.nextLine();
        int date = LocalDateTime.now().getHour();
        in.close();
        if (date >= 5 && date < 12)
            System.out.println("Доброе утро " + name);
        else if (date < 18 )
            System.out.println("Добрый день " + name);
        else if (date < 23)
            System.out.println("Добрый вечер " + name);
        else if (date >= 23 || date < 5)
            System.out.println("Доброй ночи " + name);
    }
}