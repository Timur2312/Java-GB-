package Lesson_1.HomeWork;
import java.util.Scanner;
/**
 * Реализовать простой калькулятор
 */
public class DZ3 {
    public static void main(String[] args) {
        System.out.println("Калькулятор с одним операндом (ПРИМЕР: '1+1')! \nВведите значения через пробел");
        Scanner in = new Scanner(System.in);
        String strings = in.nextLine().replace(",", ".");
        in.close();
        String[] values = strings.split(" ");
        if (values.length > 3 || values.length < 3) {
            PrintError();
        }
        else{
            String valueOne = values[0];
            String valueTwo = values[2];
            double firstNumber = CheckNUmber(valueOne);
            double secondNumber = CheckNUmber(valueTwo);
            if (firstNumber != 0 && secondNumber !=0) {
                Calculate(firstNumber, secondNumber, values);
            }
            else
                PrintError();
        }
    }
    static double CheckNUmber (String firstNumber) {
        try {
            double NewfirstNumber = Double.parseDouble(firstNumber);
            return NewfirstNumber;
        } catch (Exception e) {
            return 0;
        }
    }
    static void Calculate(double firstValue, double secondValue, String [] values ) {
        double result = 0;
        switch (values[1]) {
            case "+":
                result = firstValue + secondValue;
                System.out.printf("%s + %s = %.2f",values[0],values[2],result);
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
    static void PrintError (){
        System.out.println("Что-то пошло не так! Вы точно ввели все верно ? ");
    }
}