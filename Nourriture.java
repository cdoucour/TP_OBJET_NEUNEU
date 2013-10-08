
public class Nourriture extends Aliment{
	
	
	public Nourriture(){
		super();
	}
	
	public Nourriture( String type, int energie, int quantite, int position, String nom) {
		super(type, energie, quantite, position, nom);
	}
	
	public Nourriture(Nourriture monAliment) {
		this.type= monAliment.type;
		this.energie= monAliment.energie;
		this.quantite= monAliment.quantite;
		this.position=monAliment.position;
		this.nom=monAliment.nom;
	}

}
