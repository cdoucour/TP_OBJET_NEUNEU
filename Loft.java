import java.util.*;
import java.lang.*;


public class Loft {
	protected int hauteur;
	protected int largeur;
	protected LinkedList<Case> plateauCase;
	protected LinkedList<Neuneu> population;
	
	
	// CONSTRUCTEURS
	public Loft(){
		this.hauteur=0;
		this.largeur=0;
		this.plateauCase= new LinkedList<Case>();
		this.population= new LinkedList<Neuneu>();
		
	}
	
	public Loft(int largeur, int hauteur){
		this.hauteur=largeur;
		this.largeur=hauteur;
		this.plateauCase= new LinkedList<Case>();
		this.population= new LinkedList<Neuneu>();
		
	}
	
	public Loft(int hauteur, int largeur, LinkedList<Case> plateauCase, LinkedList<Neuneu> population){
		this.hauteur=hauteur;
		this.largeur=largeur;
		this.plateauCase= new LinkedList<Case>(plateauCase);
		this.population= new LinkedList<Neuneu>(population);
		
	}
	
	// METHODES
	public void modifierNourriture(Aliment nour, int caseModifiee, int quantite){
		
		boolean existe=false;
		for (Aliment nouri : this.plateauCase.get(caseModifiee).contenuAliment ){
				if (nouri.nom == nour.nom) {
					int i = this.plateauCase.indexOf(nouri);
					this.plateauCase.get(caseModifiee).contenuAliment.get(i).setQuantite(quantite);
					existe = true;
				}
				
		}
		
		if (existe=false){
			this.plateauCase.get(caseModifiee).contenuAliment.add(new Aliment(nour));
		}
	}
	
	
	public void tourDeJeu(){
		int i=0;
		for (i=0; i<this.population.size(); i++){
			
			this.population.get(i).seDeplacer(this.population.get(i).getPosition(), this);
			
			
			// POUR MANGER et BOIRE
			// on accède a la case et on verifie qu elle contient bien de la nourriture ou des boissons (objet de type Aliment)
			if ((this.plateauCase.get(this.population.get(i).getPosition()).contenuAliment != null)) {
				
				// si la case contient au moins un éléménet Aliment, on teste s'il s'agit de nourriture ou de boisson
				// pour appliquer a méthode manger ou boire
				for( Aliment j : this.plateauCase.get(this.population.get(i).getPosition()).contenuAliment){
					
					if (j instanceof Nourriture){
						this.population.get(i).manger(j, 1, this);
					}
					
					if (j instanceof Boisson){
						this.population.get(i).boire(j, 1, this);
					}
				}
			}
			
			
			this.population.get(i).seReproduire(this);
			
			// SE SUPPRMER (si leur energie est nulle)
			this.population.get(i).supprimer(this);
		}
	}
	
	// *******GETTERS ET SETTERS **************
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	

	
	
	
}
