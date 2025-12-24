package EX4;

public interface SujetEvenement {

	public void ajouterObservateur(ObservateurEvenement o);
    public void retirerObservateur(ObservateurEvenement o);
    public void notifierObservateurs(String evenement, Object donnees);
}
