import java.util.Scanner;
class UsernameValidate {

    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}


public class UsernameValidator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidate.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
