package Lesson_2.HomeWork;

import java.io.FileReader;

/*
 * Дана json строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 *   , 
 * создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
public class DZ_3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("./DZ_3.txt")) 
        {
         int c;
         StringBuilder stringBuilder = new StringBuilder();
         c = reader.read();
         if ((char) c == '{') {
            while ((c = reader.read()) != -1) {
                if ((char)c == '}') {
                    break;
                }
                stringBuilder.append((char)c);
            } 
            System.out.println(stringBuilder);
         }
       
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
