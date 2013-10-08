import java.util.*;


public class Case  {
	protected LinkedList<Aliment> contenuAliment;
	protected LinkedList<Neuneu> contenuNeuneu;
	public static int id_case;
	
	public Case () {
		
		this.contenuAliment= new LinkedList<Aliment>();
		this.contenuNeuneu= new LinkedList<Neuneu>();
		id_case++;
	}
	
	public Case(LinkedList<Aliment> contenuAliement, LinkedList<Neuneu> contenuNeuenu, int id_case){
		this.contenuAliment= new LinkedList<Aliment>(contenuAliment);
		this.contenuNeuneu= new LinkedList<Neuneu>(contenuNeuneu);
		id_case++;
			
	}
	
	
	public int getId_case() {
		return id_case;
	}
	
	public String toString() {
		int i=0;
		
		for (i=0; i<this.contenuAliment.size();i++){
			System.out.println("aliment "+ " type "+ this.contenuAliment.get(i).getType()+" energie "+ this.contenuAliment.get(i).getEnergie()+" quantite "+ this.contenuAliment.get(i).getQuantite()+" position "+ this.contenuAliment.get(i).getPosition()+" nom "+ this.contenuAliment.get(i).getNom());
		}
		
		i=0;
		for (i=0; i<this.contenuNeuneu.size();i++){
			System.out.println("Neuneu"+ " energie "+ this.contenuNeuneu.get(i).getEnergie()+" nourriture "+ this.contenuNeuneu.get(i).getNourriture()+" boisson "+ this.contenuNeuneu.get(i).getBoisson()+" position "+ this.contenuNeuneu.get(i).getPosition()+" id "+ this.contenuNeuneu.get(i).getId_joueur());
		}
		
		
		return "1";
	}
	
	
	
}
