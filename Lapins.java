import java.util.Random;


public class Lapins extends Neuneu{
	
	public static int nLapin;
// CONSTRUCTEURS
public Lapins (){
		super();
		
	}
public Lapins(Lapins l, Loft lf){
	super(l, lf);
}
public Lapins (int energie, String nourriture, String boisson, int position, int id_joueur){
	super(energie, nourriture, boisson, position, id_joueur);
}

public void manger(Aliment mange, int quantite, Loft plateau){
		
		//if (plateau.plateauCase.get(this.getPosition()).contenuAliment)
			
		//boolean existe=false;
		for (Aliment nouri : plateau.plateauCase.get(this.getPosition()).contenuAliment ){
				
				// Si l'element a manger est contenu dans la case 
				// A voir : condition sur le droit de manger un aliment ou pas ?
				if ((nouri.getNom() == mange.getNom())&&(this.nourriture==mange.getNom())) {
					
					// si la quantite dans la case est suffisante
					if (nouri.quantite >= quantite){
						int i=100;
						// position de l'aliement dans la liste d'aliment que contient la case
						i = plateau.plateauCase.get(this.position).contenuAliment.indexOf(nouri);
						plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).setQuantite(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite()-quantite);
						
						//on augmente l energie
						this.energie=this.energie + (quantite)*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
						
					}
					// sinon, on consomme tout et on supprime l'aliment de la liste dans la case
					else{
						int i = plateau.plateauCase.get(this.getPosition()).contenuAliment.indexOf(nouri);
						this.energie=this.energie + (plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite())*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
						plateau.plateauCase.get(this.getPosition()).contenuAliment.remove(i);
					}
					
				}
		}
		
	}
	
	
	public void boire(Aliment boire, int quantite, Loft plateau){
		// Si l'element a boire est contenu dans la case 
		// A voir : condition sur le droit de boire une boisson ou pas ?
		for (Aliment nouri : plateau.plateauCase.get(this.getPosition()).contenuAliment ){
			
			// Si l'element a manger est contenu dans la case 
			// A voir : condition sur le droit de manger un aliment ou pas ?
			if ((nouri.getNom() == boire.getNom())&&(this.boisson==boire.getNom())) {
				
				// si la quantite dans la case est suffisante
				if (nouri.quantite >= quantite){
					int i=100;
					// position de l'aliement dans la liste d'aliment que contient la case
					i = plateau.plateauCase.get(this.position).contenuAliment.indexOf(nouri);
					plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).setQuantite(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite()-quantite);
					
					//on augmente l energie
					this.energie=this.energie + (quantite)*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
					
				}
				// sinon, on consomme tout et on supprime l'aliment de la liste dans la case
				else{
					int i = plateau.plateauCase.get(this.getPosition()).contenuAliment.indexOf(nouri);
					this.energie=this.energie + (plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite())*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
					plateau.plateauCase.get(this.getPosition()).contenuAliment.remove(i);
				}
				
			}
		}
	}
	
	
	public void seDeplacer(int position, Loft plateau){
		
		Random rd = new Random();
		int m =-1+  rd.nextInt(3);
		
		
		if ( !((this.getEnergie()==0) || (m==2) || (m==0) ||(this.getPosition()+ m < 0) || (this.getPosition()+ m > 11) )){
			plateau.plateauCase.get(this.getPosition()+m).contenuNeuneu.add(this);
			plateau.plateauCase.get(this.getPosition()).contenuNeuneu.remove(this);
			this.position=m+this.getPosition();
			this.setEnergie(this.getEnergie()-1);
		}
		
		 
	}

	public void seReproduire(Loft plateau){
		
		// on part du principe que les lapins ne peuvent se reproduire que s'ils sont deux dans la case (question d intimite)
		if ((plateau.plateauCase.get(position).contenuNeuneu.size()>1)&&(this.energie>10)&&(plateau.plateauCase.get(position).contenuNeuneu.size()<3)){
			
			plateau.plateauCase.get(this.position).contenuNeuneu.add(new Lapins(this, plateau));
			plateau.population.add(plateau.plateauCase.get(this.position).contenuNeuneu.getLast());				
		}
		
	
	}
}
