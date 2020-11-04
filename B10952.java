import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals(input[1]) && Integer.parseInt(input[0]) == 0) break;
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        }
    }
}