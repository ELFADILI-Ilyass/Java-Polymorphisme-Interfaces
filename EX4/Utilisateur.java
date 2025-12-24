package EX4;

public class Utilisateur implements Notifiable {

	private String nom;
    private String email;

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    @Override
    public void recevoirNotification(String message) {
        System.out.println("[Utilisateur " + nom + "] Notification : " + message);
    }

    @Override
    public String toString() {
        return nom + " (" + email + ")";
    }
}

