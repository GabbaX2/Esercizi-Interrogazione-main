package passante.appuntamenti;

import java.util.Scanner;

public class Appointment {
    private String date;
    private String time;
    private String cause;

    public Appointment(Scanner ipt) {
        ipt.nextLine();

        System.out.println("date (DD/MM/YY) >> ");
        this.date = ipt.nextLine();

        System.out.println("time (H:MIN) >> ");
        this.time = ipt.nextLine();

        System.out.println("cause >> ");
        this.cause = ipt.nextLine();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void printDetails() {
        System.out.println("date >> " + date + "\ntime >> " + time + "\ncause >> " + cause);
    }
}
