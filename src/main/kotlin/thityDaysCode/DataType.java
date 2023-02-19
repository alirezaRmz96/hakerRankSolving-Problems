package thityDaysCode;


import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        double dob = scan.nextDouble();
        scan.nextLine();

        System.out.println(i1 + i);
        System.out.println(d + dob);
        System.out.println(s + scan.nextLine());
        scan.close();
    }
}