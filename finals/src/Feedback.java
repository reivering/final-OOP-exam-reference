public class Feedback {
    private Appointment appointment;
    private int rating;
    private String comment;

    public Feedback(Appointment appointment, int rating, String comment) {
        this.appointment = appointment;
        this.rating = rating;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    // Other getters and setters
}