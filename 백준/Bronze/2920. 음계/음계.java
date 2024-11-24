import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputArr = br.readLine().split(" ");
        int[] arr = new int[8];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        
        String result = "";
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                result = "ascending";
            } else if (arr[i] - 1 == arr[i + 1]) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}