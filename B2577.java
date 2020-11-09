import java.util.HashMap;
import java.util.*;

public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        int sum = num * num2 * num3;
        String[] nums = Integer.toString(sum).split("");
        int[] count = new int[10];

        for (int i=0; i<nums.length; i++) {
            int selected = Integer.parseInt(nums[i]);
            count[selected] += 1;
        }
        for (int i : count) {
            System.out.println(i);    
        }
    }   
}