import java.io.*;

public class MutliTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (2 <= N && N <= 20) {
            for (int i = 1; i <= 10; i++) {

                System.out.printf("%d * %d = %d\n", N, i, i * N);
            }
        }
    }

}
