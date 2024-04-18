package animaux;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import compte.CompteCourant;
import compte.OperationBancaire;
import compte.Personne;

public class Main {
	 // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    
	private List<CompteCourant> compteCourant = new ArrayList<>();
	private boolean exit = false;
	public CompteCourant getCompteCourant() {
		if (this.compteCourant.size() > 0) {
			return compteCourant.get(0);
		}
		return null;
	}
	
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant.add(compteCourant);
	}
	
	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	public Main() {
		
	}
	public static void main(String[] args) {
		/*
		 * Exercice 1
		 *  
		Animal monChien = new Animal("Rex", 5, "Mâle");
        Animal monChat = new Animal("Whiskers", 3, "Femelle");

        monChien.manger();
		
		Chien monChien = new Chien("Rex", 5, "Mâle");
        Chat monChat = new Chat("Whiskers", 3, "Femelle");

        monChien.manger();
        monChien.aboyer();
        monChat.manger();
        monChat.miauler();
        
		
		FormeGeometrique[] formes = new FormeGeometrique[]{new FormeGeometrique("forme"), new Rectangle("arnaud", 5, 4), new Carre("gui",6)};
        for (FormeGeometrique formGeo : formes) {
        	formGeo.surface(); // Affichera la surface d'une forme géométrique avec son nom
        	formGeo.perimetre(); // Affichera le périmètre d'une forme géometrique avec son nom
        } */
		Main main = new Main();
		while(!main.isExit()) {
			main.ApplicationBancaire();
		}
		System.out.println("------------------Bye Bye---------------------");
    }
	public void ApplicationBancaire() {
		System.out.println(WHITE+"----------Compte Bacaire--------------------");
		System.out.println("-Bienvennue sur notre Application Bancaire");
		System.out.println("utilisez les commande suivantes:");
		System.out.println("1- Pour créer un compte");
		System.out.println("2- Pour éffectuer le dépot");
		System.out.println("3- Pour éffectuer le retrait");
		System.out.println("4- Pour voir la liste des opérations bancaire");
		System.out.println("5- Pour sortir");
		Scanner action = new Scanner(System.in);
		String act = action.nextLine();
		switch(act) {
		case "1": {
			LocalDateTime dateDepot = LocalDateTime.now();
			CompteCourant compteCourant = null;
			System.out.println("-------Création du Compte Bacaire---------");
			System.out.println("Entrée votre prénom: ");
			Scanner firstName = new Scanner(System.in); 
			String fName = firstName.nextLine();
			System.out.println("Entrée votre nom de famille: ");
			Scanner lastName = new Scanner(System.in);
			String lName = lastName.nextLine();
			System.out.println("Entrée votre ville de résidence: ");
			Scanner adress = new Scanner(System.in);
			String adr = adress.nextLine();
			Personne personne = new Personne("11785", fName, lName, adr, LocalDate.now());
			compteCourant = new CompteCourant(personne, 50000);
			this.setCompteCourant(compteCourant);
			System.out.println(GREEN +" "+compteCourant.toString());
			break;
		}
		case "2": {
			System.out.println("----------------Dépot--------------------");
			LocalDateTime dateDepot = LocalDateTime.now();
			CompteCourant compteCourant = this.getCompteCourant();
			if (compteCourant == null) {
				System.out.println(RED+"Vellez Créer un compte avant de faire les dépots.");
				break;
			}
			System.out.println("Entrée le Montant du dépot : ");
			Scanner montant1 = new Scanner(System.in);  
			String mt1 = montant1.nextLine(); 
			compteCourant.depot(Integer.valueOf(mt1) , dateDepot, "dépot");
			System.out.println(GREEN +" "+compteCourant.toString());
			break;
		}
		case "3": {
			System.out.println("--------------Retrait----------------");
			try {
				LocalDateTime dateDepot = LocalDateTime.now();
				CompteCourant compteCourant = this.getCompteCourant();
				if (compteCourant == null) {
					System.out.println(RED+"Vellez Créer un compte avant d'effectuer les retrait.");
					break;
				}
				System.out.println("Entrée le Montant du retrait : ");
				Scanner montant3 = new Scanner(System.in);  
				String mt3 = montant3.nextLine(); 
				compteCourant.retrait(Integer.valueOf(mt3), "retrait", dateDepot);
				System.out.println(GREEN +" "+compteCourant.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case "4": {
			System.out.println("--------------Liste des Opérations----------------");
			CompteCourant compteCourant = this.getCompteCourant();
			if (compteCourant == null) {
				System.out.println(RED+"Vellez Créer un compte avant de voir la liste des opérations.");
				break;
			}
			List<OperationBancaire> operations = compteCourant.getOperations();
			for (OperationBancaire op: operations) {
				System.out.println(GREEN +" "+op.toString());
			}
			break;
		}
		case "5": {
			System.out.println("-------------- SORTIR ----------------");
			System.out.println("Voulez vous vraimment Sortir ?  1- O 2- N. entrez juste la lettre correspondant à votre choix.");
			Scanner exit = new Scanner(System.in);  
			String ex = exit.nextLine(); 
			if (ex.equals("O")) {
				setExit(true);
			}
			//appel de la fonction
			break;
		}
		
		}
	}
}
