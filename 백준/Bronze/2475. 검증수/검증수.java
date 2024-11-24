import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int res = 0;
        
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            res += num * num;
        }
        
        bw.write(String.valueOf(res % 10));
        br.close();
        bw.flush();
        bw.close();
    }
}