import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PaymentJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pay = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);
        Locale IND = new Locale("en","IN");
        String india = NumberFormat.getCurrencyInstance(IND).format(pay);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}