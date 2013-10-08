import java.util.LinkedList;
import java.util.Random;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Case> mesCases =new LinkedList<Case>();
		int i=0;
		
		for (i=0; i<12; i++){
			mesCases.add(new Case());
		}
		
		LinkedList<Neuneu> mesNeuneus =new LinkedList<Neuneu>();
		i=0;
		
	
		
		// Test constructeur Loft
		Loft monLoft = new Loft(3, 4, mesCases, mesNeuneus);
		
		
		Lapins lapin1= new Lapins(30,"carotte", "eau", 6, 1);
		monLoft.plateauCase.get(6).contenuNeuneu.add(lapin1);
		monLoft.population.add(lapin1);
		
		Lapins lapin2= new Lapins(30,"asperges", "eau", 5, 2);
		monLoft.plateauCase.get(5).contenuNeuneu.add(lapin2);
		monLoft.population.add(lapin2);
		
			
				
		// Boissons et nourriture
		Nourriture carotte1 = new Nourriture("Legumes", 100, 10, 1, "carotte");
		monLoft.plateauCase.get(1).contenuAliment.add(carotte1);
		Nourriture carotte2 = new Nourriture("Legumes", 100, 10, 10, "carotte");
		monLoft.plateauCase.get(10).contenuAliment.add(carotte2);
		Nourriture asperges = new Nourriture("Legumes", 100, 10, 4, "asperges");
		monLoft.plateauCase.get(4).contenuAliment.add(asperges);
		
		Boisson eau= new Boisson("Simple", 0, 10, 0, "eau");
		monLoft.plateauCase.get(0).contenuAliment.add(eau);
		
		i=0;
		
				
		
		int j=0;
		for (j=1; j<11; j++){
			
			monLoft.tourDeJeu();
			System.out.println("Tour "+j);
			for (i=0; i<12; i++){
				System.out.println("Je suis sur la case "+i );
				monLoft.plateauCase.get(i).toString();
				System.out.println("\n");
			}
						
		}
		
		for (Neuneu al: monLoft.plateauCase.get(1).contenuNeuneu){
			//System.out.println(monLoft.plateauCase.get(1).contenuNeuneu);
			System.out.println(al.id_joueur);
		}
		
		
		i=0;
		
		//
		
		
		/*
		//---- TEST CONSTRUCTEURS TYPES NEUNEU -----------------------------------
		// Test constructeur Lapin
		Lapins monLapin = new Lapins(100, "Carotte", "Eau", 1, 1);
		System.out.println(monLapin.energie + monLapin.nourriture + monLapin.boisson + monLapin.position + monLapin.id_joueur);
		*/
		
		/*
		// Test Constrcuteur Voraces
		Voraces monVorace = new Voraces(100, "Carotte", "Eau", 1, 1);
		System.out.println(monVorace.energie + monVorace.nourriture + monVorace.boisson +monVorace.position + monVorace.id_joueur);
		*/
		
		// 
		
		
		
		
		

	}

}
