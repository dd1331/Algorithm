import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());
        String[] array = sc.nextLine().split(" ");
        int min = 0;
        int max = 0;
        for (int i=0; i<repeat; i++) {
            if (i==0) {
                min = Integer.parseInt(array[i]);
                max = Integer.parseInt(array[i]);
                continue;
            }

            if (max < Integer.parseInt(array[i])) {
                max = Integer.parseInt(array[i]);
            } 
            if (min > Integer.parseInt(array[i])) {
                min = Integer.parseInt(array[i]);
            } 
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}