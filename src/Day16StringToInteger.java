import java.io.*;

public class Day16StringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            int sti = Integer.parseInt(S);
            System.out.println(sti);
        } catch(NumberFormatException e){
            System.out.println("Bad String");
        }


        bufferedReader.close();
    }
}
