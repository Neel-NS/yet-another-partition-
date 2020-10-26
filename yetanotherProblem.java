import java.io.BufferedReader;
import java.io.InputStreamReader;

public class yetanotherProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-->0) {
            int n = Integer.parseInt(reader.readLine());
            String arr[] = reader.readLine().split(" ");
            int a[] = new int [n];
            int max=0, b=0, f=0, s=0;
            for(int i=0; i<n; i++) {
                a[i] = Integer.parseInt(arr[i]);
                b ^= a[i];
            }
            max = b;
            for(int i=0; i<n; i++) {
                f ^= a[i];
                s = b^f;
                if((f&s) > max)
                max = (f&s);
            }
            System.out.println(max);
      }
    }
}
