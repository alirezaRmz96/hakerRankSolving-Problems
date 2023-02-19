import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }

        char[] forA = a.toLowerCase().toCharArray();
        char[] forB = b.toLowerCase().toCharArray();
        Arrays.sort(forA);
        Arrays.sort(forB);

        for (int i = 0; i < forA.length; i++) {
            if (forA[i] != forB[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
