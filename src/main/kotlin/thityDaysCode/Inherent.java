package thityDaysCode;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;
    String firstName;
    String lastName;
    int identification;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
        this.testScores = testScores;
    }

    public char calculate() {
        var count = 0;
        for (int testScore : testScores) {
            count += testScore;
        }
        var result = count / testScores.length;
        if (90 <=result && result <= 100)
            return 'O';
        else if (80 <=result && result < 90)
            return 'E';
        else if (70 <=result && result < 80)
            return 'A';
        else if (55 <=result && result < 70)
            return 'P';
        else if (40 <=result && result < 55)
            return 'D';
        else if ( result < 40)
            return 'T';

        return 'n';

    }
}

class Inherent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

