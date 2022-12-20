package Lesson_2.HomeWork;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */
public class DZ_2 {
    public static void main(String[] args) throws IOException {
        int [] mass = {1,3,5,2,4,8,7,6,9,10};
        int temp = 0;
        FileWriter logFile = new FileWriter("logFile.log", true);
        try  
        {
            for (int i = 0; i < mass.length; i++) {
                for (int j = i+1; j < mass.length; j++) {
                    if (mass[i]>mass[j]) {
                        temp = mass[i];
                        mass[i]=mass[j];
                        mass[j]=temp;
                        for (int item : mass) {
                            logFile.append(item + "\t");
                        }
                        logFile.append("\n\n");
                    }
                }
            }
            
        } catch (Exception e) {
            logFile.append(e.toString() + "\n");
        }
        finally {
            logFile.close();
        }
      
    }
}
