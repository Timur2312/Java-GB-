package Lesson_2;

import java.io.File;
import java.io.FileWriter;
/*
 * Считывает имена фалов из папки в массив строк и записываем в файл
 */
import java.io.IOException;
import java.io.PrintStream;

public class Exp_5 {
    public static void main(String[] args) throws IOException {
        FileWriter fileLog = new FileWriter("logfile.log", true);

        try {
            File file = new File("c:/text.txt");
            file.createNewFile();
            PrintStream stream = new PrintStream(file);
            System.setOut(stream);

            // определяем объект для каталога
            File dir = new File("./");
            // если объект представляет каталог
            if (dir.isDirectory()) {
                // получаем все вложенные объекты в каталоге
                for (File item : dir.listFiles()) {

                    if (item.isDirectory()) {

                        System.out.println(item.getName() + "  \t folder");
                    } else {

                        System.out.println(item.getName() + "\t file");
                    }
                }
            }
        } catch (Exception e) {
            fileLog.append(e.toString() + "\n");
        }
        fileLog.close();
    }
}
