package EX4;

public class TestSystemeNotification {

    public static void main(String[] args) {

        Utilisateur ilyass = new Utilisateur("Ilyass", "ilyass@gmail.com");
        Utilisateur ahmed = new Utilisateur("Ahmed", "ahmed@gmail.com");


        ServiceNotification emailService = new ServiceNotification("EmailSender"); 
        ServiceNotification smsService = new ServiceNotification("SMSSender");
        emailService.mettreAJour("alerteCritique", ilyass);
        smsService.mettreAJour("nouvelleCommande", ahmed);
    }
}
