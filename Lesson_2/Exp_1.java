package Lesson_2;

import java.util.Scanner;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1
 */
public class Exp_1 {

    public static void main(String[] args) {    
    Scanner in = new Scanner(System.in);
    int number = Integer.parseInt(in.nextLine());
    in.close();
    String c1 = "c1";
    String c2 = "c2";
    StringBuilder worlBuilder = new StringBuilder(); 
    for (int i = 0; i <= number ; i++) {
         worlBuilder.append(c1+c2);
    }
        System.out.println(worlBuilder);
    }
}