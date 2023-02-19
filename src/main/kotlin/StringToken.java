import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToken {
//    static String[] stringList;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String regex = scan.next();
        String s1 = "alireza";
        try {
            var stringList = s.trim().split(regex);
            for (String value : stringList) {
                System.out.println(value);
            }
        }catch (Exception e){
            System.out.println("Invalid");
        }

        scan.close();
    }
}
