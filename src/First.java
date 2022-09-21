import java.util.Scanner;
public class First {
    public static void main(String[] args){
        int[] nums = new int[11];
        for(int i= 10; i <= 20; i++){
            nums[i - 10] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
