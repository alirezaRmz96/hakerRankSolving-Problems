import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class JavaStatic {

    public static Scanner scanner = new Scanner(System.in);
    public static int H = getH();
    public static int B = getB();
    public static boolean flag = getFlag();

    private static int getH() {
        return scanner.nextInt();
    }

    private static int getB() {
        return scanner.nextInt();
    }

    private static boolean getFlag() {
        try {
            if (H > 0 && B > 0)
                return true;
            else
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}
