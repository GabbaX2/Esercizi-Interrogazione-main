package passante.appuntamenti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int max = 0;

        try {
            System.out.println("quanti appuntamenti hai ?? >> ");
            max = ipt.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("exception >> " + e);
            System.exit(1);
        }

        Memo memo = new Memo(max);

        for (var i = 0; i < max; i++) {
            System.out.println("memo " + (i+1) + " >> ");
            memo.addAppointment(new Appointment(ipt));
        }

        memo.printAppointments();
    }
}
