public class Therapist extends User {
    private String specialities;
    private String servicesOffered;

    public Therapist(int id, String name, String email, String password, String specialities, String servicesOffered) {
        super(id, name, email, password);
        this.specialities = specialities;
        this.servicesOffered = servicesOffered;
    }

    // Getters and Setters
}