import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        String ret = String.valueOf(A*B*C);
        
        int[] numCnts = new int[10];
        
        for (int i = 0; i < ret.length(); i++) {
            char digit = ret.charAt(i);
            numCnts[digit - '0']++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numCnts[i]);
        }
        
    }
}