package projet.joueur;

import projet.cartes.StockCarte;

public class Partie {

	private Partie partie;
	private int nbrJoueurs;
	private int tours;
	
	
	private Partie partie(){
		return partie;
		
	}
	
	public Partie getInstance(){
		return partie;
	}
	
	public boolean estTermine(){
		return true;
	}
	
//	public JV creerJV(){
		
//	}
	
//	public Strategie setStrategie(){
		
//	}
	
	public void donnerDivinite(){
		
	}
	
	public static void main(String[] args) {
	
		StockCarte s = new StockCarte();
		JoueurPhysique j1 = new JoueurPhysique();
		Main m1 = new Main();
		j1.setLaMain(m1);
		s.distribuerCartes(m1);
		j1.getLaMain();
		while (j1.laMain.getListeCartesMain().size() >0){
			j1.choisirCarte();
		}
		
	}

}
