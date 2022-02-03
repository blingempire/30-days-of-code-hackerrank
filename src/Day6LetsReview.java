import java.io.*;
import java.util.*;

public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        keyboard.nextLine();

        String[] sArray = new String[n];
        for(int i = 0; i < n; i++){
            sArray[i] = keyboard.nextLine();
        }
        for(int i=0; i < n; i++){
            char[] arr = sArray[i].toCharArray();
            for(int e = 0; e < arr.length ; e+=2){
                System.out.print(arr[e]);
            }
            System.out.print(" ");
            for(int o=1; o < arr.length ; o+=2) {
                System.out.print(arr[o]);
            }
            System.out.println();
        }
    }
}
