public class Patient extends User {
    private String nextOfKin;
    private String medicalHistory;

    public Patient(int id, String name, String email, String password, String nextOfKin, String medicalHistory) {
        super(id, name, email, password);
        this.nextOfKin = nextOfKin;
        this.medicalHistory = medicalHistory;
    }

    // Getters and Setters
}