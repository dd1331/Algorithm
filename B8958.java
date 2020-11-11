import java.util.Arrays;
import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());

        for (int i=0; i < repeat; i++) {
            String[] input = sc.nextLine().split("");
            int score = 0;
            int sum = 0;
            for (int j=0; j< input.length; j++) {
                if (input[j].equals("X")) {
                    score = 0;
                    continue;
                }
                if (j == 0) score = 1;
                else if (input[j].equals(input[j-1])) score++; 
                else if (input[j].equals("O")) score = 1; 
                else score = 0;

                sum += score;
            }
            System.out.println(sum);
        }
        sc.close();
        
    }

}