import java.util.Arrays;
import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");

        for (int j = 0; j < 2; j++) {
            String temp = "";
            int end = 2;
            String num = array[j];
            String[] arr = num.split("");

            for (int i = 0; i < 2; i++) {
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
            array[j] = String.join("", arr);
        }
        if (Integer.parseInt(array[0]) > Integer.parseInt(array[1]))
            System.out.println(array[0]);
        else
            System.out.println(array[1]);
        sc.close();
    }
}