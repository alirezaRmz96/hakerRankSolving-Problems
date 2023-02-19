import java.util.Scanner;

public class PatternTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            String s = "alireza";
            try {
                var stringList = s.trim().split(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}


