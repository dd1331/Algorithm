import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int mToSubtact = 45;
        int gap = 0;
        int resultM = m;
        int resultH = h;

        if (m < mToSubtact) {
            if (h == 0) resultH = 23;
            else resultH = h - 1;
            gap = m - mToSubtact;
            resultM = 60 + gap;
        } else {
            resultM = m - mToSubtact;
        }
        System.out.println(resultH+" "+resultM);
    }
    
}