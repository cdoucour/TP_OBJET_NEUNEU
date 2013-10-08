public class Alcool extends Boisson {
	
	public Alcool(){
		super();
	}
	
	public Alcool( String type, int energie, int quantite, int position, String nom) {
		super(type, energie, quantite, position, nom);
	}
	
	public Alcool(Alcool monAliment) {
		this.type= monAliment.type;
		this.energie= monAliment.energie;
		this.quantite= monAliment.quantite;
		this.position=monAliment.position;
		this.nom=monAliment.nom;
	}

}
