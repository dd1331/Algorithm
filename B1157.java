import java.util.*;


public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String arr [] = string.split("");
        // String arr [] = Arrays.toString(string.toCharArray());
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        for (String c : arr) {
            String upperC = c.toUpperCase();
            // upperC.charAt(0)
            if (!(65 <= (int) upperC.charAt(0) && (int) upperC.charAt(0) <= 90)) {
                continue;
            }
            if (hashMap.get(upperC) == null) {
                hashMap.put(upperC, 1);
                continue;
            }
            int val = hashMap.get(upperC);
            hashMap.put(upperC, val + 1); 

        }
        ArrayList<Integer> list = new ArrayList<Integer>(hashMap.values());
        int count = 0;
        Integer max = Collections.max(list);
        String maxKey = "a";

        for(Map.Entry e : hashMap.entrySet()) {
            if (e.getValue().equals(max)) {
                maxKey = (String) e.getKey();
                count++;
            }
        }
        
        if (count > 1) {
            System.out.println("?");
            sc.close();
            return;
        }
        System.out.println(maxKey.toUpperCase());
        sc.close();
    }
}