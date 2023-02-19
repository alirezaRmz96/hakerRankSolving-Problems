import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 1; scanner.hasNext(); i++)
                stringBuilder.append(i)
                        .append(" ")
                        .append(scanner.nextLine())
                        .append("\n");

            System.out.println(stringBuilder);
        }
    }
}
