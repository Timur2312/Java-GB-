import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/**
 * DZ1
 */
public class DZ1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        in.close();
        if (CheckNumber(n) == true) {
            double number = Double.parseDouble(n);
            double result = TriangularNumber(number);
            System.out.println(result);
        }
        else {
            System.out.println("Вы ввели не число");
        }
     
    }
    static double TriangularNumber(double number) {
        double result = 1d / 2 * number * (number + 1);
        return result;
    }
    static Boolean CheckNumber(String value){

        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}