import java.io.*;

public class Day3ConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N%2 != 0) {
            System.out.println("Weird");
        } else if(N <= 5) {
            System.out.println("Not Weird");
        } else if (N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
