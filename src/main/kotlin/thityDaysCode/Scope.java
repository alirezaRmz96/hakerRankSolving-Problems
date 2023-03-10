package thityDaysCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    int result = 0;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for (int element : elements) {
            for (int j = 1; j < elements.length; j++) {           // 1 2 5
                result = element - elements[j];
                if (Math.abs(result) > maximumDifference)
                    maximumDifference = Math.abs(result);
            }
        }
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
