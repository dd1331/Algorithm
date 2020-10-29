import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());
        for (int i=0; i<repeat; i++) {
            String[] input = sc.nextLine().split(" ");
            int result = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            System.out.println(result);
        }
        sc.close();
    }
}