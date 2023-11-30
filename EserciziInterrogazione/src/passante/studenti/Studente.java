package passante.studenti;

import java.util.Scanner;

public class Studente {
    private String name;
    private String surname;
    private double[] grades = new double[5];

    public Studente(Scanner scanner) {
        scanner.nextLine();

        System.out.println("name >> ");
        this.name = scanner.nextLine();

        System.out.println("Surname >> ");
        this.surname = scanner.nextLine();

        for (var i = 0; i < grades.length; i++) {
            System.out.println("grade >> ");
            double grade;
            do {
                grade = scanner.nextDouble();
                if (grade < 0 || grade > 10) {
                    System.out.println("Voto non valido!! Riprova.");
                } else {
                    addGrades(i, grade);
                }
            } while (grade < 0 || grade > 10);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String addGrades(int pos, double grade) {
        if (pos < 0 || pos >= grades.length) {
            return "Impossibile aggiungere voto!!";
        }
        if (grades[pos] == 0) {
            grades[pos] = grade;
            return "Succesfull!!";
        }
        return "is already here!!";
    }

    public double media() {
        double sum = 0;
        int pos = 0;
       for (var i = 0; i < grades.length; i++) {
           if (grades[i] != 0) {
               pos++;
           }
           sum += grades[i];
       }
       if (pos > 0) {
           return sum/pos;
       } else {
           return 0;
       }
    }

    public void printDetails() {
        System.out.println("name >> " + name + "\nsurname >> " + surname);
        System.out.println("grades >> ");

        for (var i = 0; i < grades.length; i++) {
            if (grades[i] != 0) {
                System.out.println(i + ". " + grades[i]);
            }
        }

        System.out.println("media >> " + media());
    }
}
