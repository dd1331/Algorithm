import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int max = 0;
        int index = 0;
        for (int i=0; i<9; i++) {
            array[i] = sc.nextInt();
            if (i == 0) {
                max = array[0];
                index = i;
            }

            if ( max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
        
    }
}