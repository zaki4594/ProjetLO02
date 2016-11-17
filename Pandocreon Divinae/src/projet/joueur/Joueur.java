package projet.joueur;

import java.util.ArrayList;

import projet.cartes.*;


public  abstract class Joueur {

	private int id;
	private String nom;
	public enum divinite {
		JOUR,AUBE,NUIT,CRESPUSCULE
	}
	private int ptActionJour;
	private int ptActionNuit;
	private int ptActionNeant;
	private int ptPriere;
	private enum capaciteSpeciale{}
	private boolean disponibiliteCapacite;
	protected Main laMain;
	
	public abstract void lancerDeCosmogonie();
	
	public abstract void piocheDivinite();
	
	public void defausserCarte(){
		
	}
	
	public void utiliserCarte(){
		
	}
	
    public int getPtPriere(){
		return ptPriere;
	}
	
    public boolean estElimine(){
		return false;
		
	}
    
    public boolean estGagne(){
		return true;
	}
    
    public void activerCapacite(){
		
	}
    
    public void passerTour(){
		
	}
    
   public void setLaMain(Main laMain){
	   this.laMain = laMain;
   }
    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
