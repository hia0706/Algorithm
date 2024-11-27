import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        String[] name = new String[t];
        
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            
            name[i] = str.substring(0, 1) + str.substring(str.length() - 1, str.length());
            
            bw.write(name[i] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}