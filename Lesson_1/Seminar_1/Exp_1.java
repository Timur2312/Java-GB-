package Lesson_1.Seminar_1;

/*
 * Переносит определенное значение с конец массива
 */
public class Exp_1 {
    public static void main(String[] args) {
        int [] nums = {3,2,2,5,3};
        int temp;
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == val) {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("----------");
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
