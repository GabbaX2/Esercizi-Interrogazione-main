package passante.appuntamenti;

public class Memo {
    private Appointment[] appointments;
    private int max;

    public Memo(int max) {
        this.max = max;
        this.appointments = new Appointment[max];
    }

    void addAppointment(Appointment a) {
        for (var i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                appointments[i] = a;
                break;
            }
        }
    }

    void printAppointments() {
        for (Appointment a : appointments) {
            if (a != null) {
                a.printDetails();
                System.out.println("");
            }
        }
    }
}
