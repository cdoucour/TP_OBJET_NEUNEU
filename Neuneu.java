
public abstract class Neuneu {
	
	protected int energie;
	protected String nourriture; //type de nourriture mangée par le neuneu
	protected String boisson ; //type de boisson bue par le neuneu
	protected int position;
	public static int nNeuneus;
	protected int id_joueur;
	
	
	public Neuneu (){
		this.setEnergie(10);
		this.setNourriture("inconnu");
		this.setBoisson("inconnu");
		this.setPosition(0);
		this.setId_joueur(0);
		nNeuneus=+1;
	}
	
	public Neuneu (Neuneu l, Loft lf){
		this.setEnergie(10);
		this.setNourriture(l.nourriture);
		this.setBoisson(l.boisson);
		this.setPosition(l.position);
		this.setId_joueur(lf.population.size()+1);
		nNeuneus=+1;
	}
	
	public Neuneu (int energie, String nourriture, String boisson, int position, int id_joueur){
		this.setEnergie(energie);
		this.setNourriture(nourriture);
		this.setBoisson(boisson);
		this.setPosition(position);
		this.setId_joueur(id_joueur);
		nNeuneus=+1;
	}
	
	
	// -------- DECLARATION METHODES ABSTRAITES ------------------------------
	public abstract void manger(Aliment mange, int quantite, Loft plateau);
	
	
	public abstract void boire(Aliment boire, int quantite, Loft plateau);
	
	//Pour se déplacer : tous les individus des classes Lapins, Voraces et Cannibales se déplacent de facon aléatoire
	// avec un déplacement de -1, 0 ou 1
	// Les erratiques se deplacent aussi de facon aléatoire mais peuvent faire des déplacement plus grands (entre -2 et 2)
	public abstract void seDeplacer(int position, Loft plateau);
	
	// ---------- METHODES SUPPLEMENTAIRES ------------------------------------
	public void supprimer(Loft plateau){
		
		if (this.energie==0){
			plateau.plateauCase.get(this.position).contenuNeuneu.remove(this);
			plateau.population.remove(this);
		}
		
	}
	
	public abstract void seReproduire(Loft plateau);
	
	public int donnerPosition(){
		return this.position;
		
	}

	// GETTERS ET SETTERS
	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public String getNourriture() {
		return nourriture;
	}

	public void setNourriture(String nourriture) {
		this.nourriture = nourriture;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getId_joueur() {
		return id_joueur;
	}

	public void setId_joueur(int id_joueur) {
		this.id_joueur = id_joueur;
	}
	
	
}
