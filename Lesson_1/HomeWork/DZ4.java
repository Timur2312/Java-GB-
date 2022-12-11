package Lesson_1.HomeWork;



/*+Задано уравнение вида q + w = e. При q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/
public class DZ4 {

public static void main(String[] args) {
    int firstValue = 68;
    int secondValue = 2;
    int result = 69;
    boolean stop = true;
    if (firstValue > result || secondValue > result || firstValue + secondValue > result) {
        System.out.println("ошибка");
    }
    else if (firstValue + secondValue == result) {
        System.out.printf("%d + %d = %d", firstValue,secondValue,result);
    }
    else {
        while (stop) {
            firstValue += 1;
            secondValue = 5;
            for (int i = 0; i <= 11; i++) {
                if (i == 11) {
                    System.out.println("решения нет");
                    stop = false;
                }
                secondValue+=10;
                    if (firstValue + secondValue == result) {
                        System.out.printf("%d + %d = %d", firstValue,secondValue,result);
                        stop = false;
                        break;
                    }
                }
        }
    }
}
/*
 * Все возможные решения
 */
 // var result = 69;
    // for (int i = 0; i <= result; i++) {
    //     for (int j = 0; j <= result; j++) {
    //         if (i+j == result) {
    //             System.out.printf("%d + %d = %d\n", i,j,result);
    //         }
}
   
    
   
