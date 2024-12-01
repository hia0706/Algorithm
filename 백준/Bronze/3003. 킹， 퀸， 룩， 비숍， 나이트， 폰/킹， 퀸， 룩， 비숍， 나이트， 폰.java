import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < chess.length; j++) {
            arr[j] = chess[j] - arr[j];
            bw.write(arr[j] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}