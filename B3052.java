import java.util.Arrays;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int[] remainder = new int[42];
        int count = 0;
        for(int i=0; i<10; i++) {
            input[i] = Integer.parseInt(sc.nextLine());
            remainder[input[i]%42] ++;
        }
        for(int i=0; i<42; i++) {
            if (remainder[i] != 0) count++;
        }
        System.out.println(count);
    }
}