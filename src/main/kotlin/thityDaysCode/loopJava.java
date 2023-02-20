package thityDaysCode;

import java.util.Scanner;

public class loopJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i < 11; i++) {
            System.out.println(n +" x " + i + " = " + n*i);
        }
    }
}
