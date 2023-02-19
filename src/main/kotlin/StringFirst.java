import java.util.Scanner;

public class StringFirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstString = sc.next();
        String secondString = sc.next();

        System.out.println(firstString.length() + secondString.length());
        System.out.println(firstString.compareTo(secondString) > 0 ? "Yes" : "No");
        String first = firstString.substring(0, 1).toUpperCase()
                + firstString.substring(1);
        String second = secondString.substring(0, 1).toUpperCase()
                + secondString.substring(1);
        System.out.println(first + " " + second);

    }
}
