import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        if (string.length() == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        String[] array = string.split(" ");
        System.out.println(array.length);
        sc.close();
    }
}