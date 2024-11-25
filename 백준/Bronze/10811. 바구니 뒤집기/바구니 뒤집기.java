import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }
        
        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            
            while (a < b) {
                int tmp = basket[a];
                basket[a++] = basket[b];
                basket[b--] = tmp;
            }
        }
        for (int b : basket) {
            bw.write(b + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}