import java.util.*;
class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < repeat; i++){
            // int i = 0;
            // while (i < repeat) {
                
                
            String string = sc.nextLine();
            String[] array = string.split(" ");
            // Char[] array = string.toCharArray();
            int repeat2 = Integer.parseInt(array[0]);
            String word = array[1];
            char [] array2 = word.toCharArray();
            
                // for(char s : array2) {
            for(int k = 0; k < array2.length; k++){
                for(int j = 0; j < repeat2; j++){
                    System.out.print(array2[k]);
                    // System.out.print('a');
                }
            }
            System.out.println();
            
            

        }
        sc.close();


        
    
        
        
        sc.close();
    }
}
