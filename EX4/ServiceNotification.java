package EX4;

public class ServiceNotification implements ObservateurEvenement {

	private String typeService;

    public ServiceNotification(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public void mettreAJour(String evenement, Object donnees) {

        if (typeService.equals("EmailSender")) {
            System.out.println("[Service Email] événement : " + evenement);
        } else if (typeService.equals("SMSSender")) {
            System.out.println("[Service SMS] événement : " + evenement);
        }

        if (donnees instanceof Utilisateur) {
            ((Utilisateur) donnees)
                .recevoirNotification("Message lié à " + evenement);
        }
    }
	
}
