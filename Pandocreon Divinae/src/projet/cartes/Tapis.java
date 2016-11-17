package projet.cartes;

import java.util.ArrayList;
/**
 * La classe Tapis représent le tapis du jeu
 * @author Tung NGO
 *
 */
public class Tapis {
	/**
	 * La liste des cartes Croyants déposés au centre du tapis
	 */
	private ArrayList <CarteCroyants> ListeCartesCroyants = new ArrayList <CarteCroyants> ();
	public void recevoirCartes(CarteCroyants c){
		ListeCartesCroyants.add(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tapis t = new Tapis();
		
	}

}
