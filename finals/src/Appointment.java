import java.util.Date;

public class Appointment {
    private Date date;
    private Therapist therapist;
    private Patient patient;

    public Appointment(Date date, Therapist therapist, Patient patient) {
        this.date = date;
        this.therapist = therapist;
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    // Other getters and setters
}