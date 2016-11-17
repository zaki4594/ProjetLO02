package projet.cartes;
/**
 * La classe GuideSpirituel représente les cartes Guide Spirituel dans le jeu
 * @author Tung NGO
 *
 */
public class GuideSpirituel extends Carte {
	private Integer nbrCartesCroyantsRattaches; // le nombre de cartes Croyants qu'elle rattache en ce moment
	private String [] dogmes= new String[2];
	private Integer nbrCartesCroyants;
	/**
	 * Constructeur par défaut d'une carte Guide Spirituel
	 * @param nom: nom de la carte
	 * @param idCarte: id de la carte
	 * @param type : type de la carte
	 * @param origine : origine de la carte
	 * @param dogmes : dogmes de la carte
	 * @param nbrCartesCroyants : nombre maximal de cartes Croyants que la carte Guide Spirituel peut rattacher
	 * @param capaciteSpeciale : capacité spéciale de la carte
	 */
	public GuideSpirituel (String nom, Integer idCarte, TypeCarte type, Origine origine, String [] dogmes, Integer nbrCartesCroyants, CapaciteSpeciale capaciteSpeciale ){
		this.nom = nom;
		this.idCarte = idCarte;
		this.type = TypeCarte.GuideSpirituel;
		this.origine = origine;
		this.dogmes = dogmes;
		this.nbrCartesCroyants = nbrCartesCroyants;
		this.capaciteSpeciale = capaciteSpeciale;
	}
	
	public String afficherCarte(){
		return ("c_"+idCarte+" :"+"Carte "+type+" "+nom+" d'origine "+origine+", dogmes:"+dogmes[0]+","+
				dogmes[1]+", capacité"+capaciteSpeciale+" et peut rattacher "+nbrCartesCroyants+" cartes Croyants");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
