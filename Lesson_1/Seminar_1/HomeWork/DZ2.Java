// Вывести все простые числа от 1 до 1000
public class DZ2 {
    public static void main(String[] args) {
        System.out.print(2 + " ");
        for (int i = 2; i <= 1000; i++)
        if (i % 2 != 0){
             System.out.print(i + " ");
        }
    }
}