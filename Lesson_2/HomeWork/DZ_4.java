package Lesson_2.HomeWork;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

/*
 * К калькулятору из предыдущего дз добавить логирование.
 */
public class DZ_4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(DZ_4.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("logfile.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        logger.info("Запуск прогрммы \n");
        
        logger.info("Замена запятых на точки\n");

        System.out.println("Калькулятор с одним операндом (ПРИМЕР: '1+1')! \nВведите значения через пробел");
        Scanner in = new Scanner(System.in);

        String strings = in.nextLine().replace(",", ".");
        in.close();
 
        logger.info("Разделение строки\n");

        String[] values = strings.split(" ");

        logger.info("Проверка на кол-во значений\n");

        if (values.length > 3 || values.length < 3) {
            PrintError();
        } else { 
            String valueOne = values[0];
            String valueTwo = values[2];

            logger.info("Проверка значений на числа\n");

            double firstNumber = CheckNUmber(valueOne);
            double secondNumber = CheckNUmber(valueTwo);

            logger.info("Запуск калькулятора\n");

            if (firstNumber != 0 && secondNumber != 0) {
                Calculate(firstNumber, secondNumber, values);
            } else
                PrintError();
        }
    }

    static double CheckNUmber(String firstNumber) {
        try {
            double NewfirstNumber = Double.parseDouble(firstNumber);
            return NewfirstNumber;
        } catch (Exception e) {
            return 0;
        }
    }

    static void Calculate(double firstValue, double secondValue, String[] values) {
        double result = 0;
        switch (values[1]) {
            case "+":
                result = firstValue + secondValue;
                System.out.printf("%s + %s = %.2f", values[0], values[2], result);
                break;
            case "-":
                result = firstValue - secondValue;
                
                System.out.printf("%s - %s = %.2f", values[0], values[2], result);
                break;
            case "*":
                result = firstValue * secondValue;
                System.out.printf("%s * %s = %.2f", values[0], values[2], result);
                break;
            case "/":
                result = firstValue / secondValue;
                System.out.printf("%s / %s = %.2f", values[0], values[2], result);
                break;
            default:
                PrintError();
                break;
        }
    }

    static void PrintError() {
        System.out.println("Что-то пошло не так! Вы точно ввели все верно ? ");
    }
}
