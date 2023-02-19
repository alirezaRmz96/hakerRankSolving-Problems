import java.util.*;

public class SmallestAndLargest {

    public static String getSmallestAndLargest(String str, Integer k) {

        String smallest = "";
        String largest = "";
        String str_temp = new String();
        String s = new String();

        str_temp = s.substring(0, k);
        smallest = str_temp;
        largest = str_temp;
        for (int j = 0; j < s.length() - (k - 1); j++) {
            str = s.substring(j, j + k);
            System.out.println(str);

            if (smallest.compareTo(str) > 0)
                smallest = str;
            else if (largest.compareTo(str) < 0)
                largest = str;
        }
        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var str = scanner.next();
        var k = scanner.nextInt();

        System.out.println(getSmallestAndLargest(str, k));
    }
}
