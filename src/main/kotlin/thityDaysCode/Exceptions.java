package thityDaysCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            System.out.println(Integer.parseInt(S));
        }catch (RuntimeException e){
            System.out.println("Bad String");
        }
    }
}
