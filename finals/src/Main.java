import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a patient
        System.out.println("Enter patient details:");
        System.out.print("ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Email: ");
        String patientEmail = scanner.nextLine();
        System.out.print("Password: ");
        String patientPassword = scanner.nextLine();
        System.out.print("Next of Kin: ");
        String nextOfKin = scanner.nextLine();
        System.out.print("Medical History: ");
        String medicalHistory = scanner.nextLine();
        Patient patient = new Patient(patientId, patientName, patientEmail, patientPassword, nextOfKin, medicalHistory);

        // Create a therapist
        System.out.println("Enter therapist details:");
        System.out.print("ID: ");
        int therapistId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String therapistName = scanner.nextLine();
        System.out.print("Email: ");
        String therapistEmail = scanner.nextLine();
        System.out.print("Password: ");
        String therapistPassword = scanner.nextLine();
        System.out.print("Specialities: ");
        String specialities = scanner.nextLine();
        System.out.print("Services Offered: ");
        String servicesOffered = scanner.nextLine();
        Therapist therapist = new Therapist(therapistId, therapistName, therapistEmail, therapistPassword, specialities, servicesOffered);

        // Book an appointment
        System.out.println("Booking an appointment...");
        Appointment appointment = new Appointment(new Date(), therapist, patient);
        System.out.println("Appointment booked for " + patient.getName() + " with " + therapist.getName() + " on " + appointment.getDate());

        // Leave feedback
        System.out.println("Leave feedback for the appointment:");
        System.out.print("Rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Comment: ");
        String comment = scanner.nextLine();
        Feedback feedback = new Feedback(appointment, rating, comment);
        System.out.println("Feedback: " + feedback.getComment() + " Rating: " + feedback.getRating());

        scanner.close();
    }
}