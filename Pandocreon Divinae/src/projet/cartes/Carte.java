package projet.cartes;
/**
 * La classe Carte représente les Cartes dans le jeu
 * @author Tung NGO
 *
 */
public abstract class   Carte {
	
	protected String nom ; // nom de la Carte
	protected Integer idCarte; // Id de la Carte
	protected TypeCarte type; // Le type (Carte Croyants, Guide Spirituel, Deus Ex, Apocalypse) de la Carte
	protected Origine origine; // L'orgine (Jour, Nuit, Neant) de la Carte
	protected CapaciteSpeciale capaciteSpeciale; // La capacité spéciale de la Carte
	public abstract String afficherCarte();
}


 enum TypeCarte {
	Croyant, GuideSpirituel, DeusEx, Apocalypse
}
 enum Origine {
	Jour, Nuit, Neant, None 
}
 enum CapaciteSpeciale {
	Cap_1, Cap_2, Cap_3, Cap_4, Cap_5, Cap_6, Cap_7, Cap_8, Cap_9, Cap_10,
	Cap_11, Cap_12, Cap_13, Cap_14, Cap_15, Cap_16, Cap_17, Cap_18, Cap_19, 
	Cap_20, Cap_21, Cap_22, Cap_23, Cap_24, Cap_25, Cap_26, Cap_27, Cap_28, 
	Cap_29, Cap_30, Cap_31, Cap_32, Cap_33, Cap_34, Cap_35, Cap_36, Cap_37,
	Cap_38, Cap_39, Cap_40, Cap_41, Cap_42
}