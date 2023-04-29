package thityDaysCode;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator_interfaces implements AdvancedArithmetic {
    int sum = 0;

    public int divisorSum(int n) {
        if (n == 1){
            return 1;
        }
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.println("i: " +i);
                sum += i;
                System.out.println("sum: " +sum);
            }
        }
        return sum;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        AdvancedArithmetic myCalculator = new Calculator_interfaces();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
