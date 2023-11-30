package passante.studenti;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int nOfStudents = 0;

        try {
            System.out.println("numero di studenti >> ");
            nOfStudents = ipt.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("invalid input");
            System.exit(1);
        }

        Aula a1 = new Aula(nOfStudents);

        for (var i = 0; i < nOfStudents; i++) {
            System.out.println("STUDENTS SPECIFICSSS >> ");
            a1.addStudent(new Studente(ipt));
        }

        System.out.println("STUDENT DETAILSSSSS >> ");
        a1.printStudents();
    }
}