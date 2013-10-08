
public class Boisson extends Aliment {
	
	public Boisson(){
		super();
	}
	
	public Boisson( String type, int energie, int quantite, int position, String nom) {
		super(type, energie, quantite, position, nom);
	}
	
	public Boisson(Boisson monAliment) {
		this.type= monAliment.type;
		this.energie= monAliment.energie;
		this.quantite= monAliment.quantite;
		this.position=monAliment.position;
		this.nom=monAliment.nom;
	}
}
