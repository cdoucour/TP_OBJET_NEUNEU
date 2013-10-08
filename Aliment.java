public class Aliment {
	
	protected String type;
	protected int energie;
	protected int quantite;
	protected int position;
	protected String nom;
	
	public Aliment(){
		this.type="inconnu";
		this.energie=0;
		this.quantite=0;
		this.position=0;
		this.nom= "inconnu";
	}
	
	public Aliment( String type, int energie, int quantite, int position, String nom) {
		this.type=type;
		this.energie=energie;
		this.quantite=quantite;
		this.position=position;
		this.nom=nom;
	}
	
	public Aliment(Aliment monAliment) {
		this.type= monAliment.type;
		this.energie= monAliment.energie;
		this.quantite= monAliment.quantite;
		this.position=monAliment.position;
		this.nom=monAliment.nom;
	}

	// GETTERS ET SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
