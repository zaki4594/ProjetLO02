package projet.joueur;
import java.util.ArrayList;
import java.util.Scanner;

public class JoueurPhysique extends Joueur{

	static Scanner scan = new Scanner(System.in);
	static Scanner nom = new Scanner(System.in);
	private static int nbrJoueurs;
	
	public void lancerDeCosmogonie(){
		
	}
	
public void piocheDivinite(){
		
	}
	
	public void commencerJeu(){
		
	}
	
	public void abandonnerJeu(){
		
	}
	
	public void choisirMode(){
		
	}
	
	public static String setNom(){
		System.out.println("Mettez votre nom : ");
		return nom.nextLine();
		
	}
	
	public static int setNbrJoueurs(){
		
		int a=7;
		while(a>5){//pour eviter l'utilisateur de mettre joueurs virtuels plus de 6
			System.out.println("Combien de joueur que vous voulez jouer avec (max 5 joueurs) ?");
			a = scan.nextInt();
		}
		return a;
	}
	
	public void sauvegarderJeu(){
		
	}
	public  void getLaMain(){
		   System.out.println("Vous avez les cartes suivantes:");
		   for (int i=0; i< laMain.getListeCartesMain().size(); i++){
			   System.out.println(laMain.getListeCartesMain().get(i).afficherCarte());
		   }
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		nbrJoueurs=setNbrJoueurs();
		
		System.out.println("Bonjour, "+ setNom()+ " vous avez choisi " + nbrJoueurs + " joueurs virtuels  à jouer avec.");
		System.out.print("Votre Divinité est ");
		DeCosmogonie.resultatLancement();
		
		ArrayList<JoueurVirtuel> players = new ArrayList<JoueurVirtuel>();
		
		
	}

}
