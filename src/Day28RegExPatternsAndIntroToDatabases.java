import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Day28RegExPatternsAndIntroToDatabases {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String m = "@gmail.com";

        List <String> a = new LinkedList<>();

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                if(emailID.contains(m)){
                    a.add(firstName);
                }


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Collections.sort(a);

        for(String first:a) {
            System.out.println(first);
        }

        bufferedReader.close();
    }
}
