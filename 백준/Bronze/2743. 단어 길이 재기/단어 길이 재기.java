import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
        }
        System.out.print(cnt);
    }
}