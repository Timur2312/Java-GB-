package Lesson_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод, который запишет эту строку в простой текстовый файл,
 * обработайте исключения.
 */
public class Exp_4 {

    public static void main(String[] args) throws IOException {
        String st = "TEST".repeat(2);
        FileWriter b = new FileWriter("test.txt",true);
        b.write(st + "\n");
        b.close();
    }
}