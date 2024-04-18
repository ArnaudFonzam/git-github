package compte;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Compte {

	static long nbComptes = 0;
	
	private long numCompt;
	private double solde;
	private Personne personne;
	private List<OperationBancaire> operations = new ArrayList<>();
	
	public Compte(Personne personne, double solde) {
		nbComptes = nbComptes + 1;
		this.numCompt = nbComptes;
		this.personne = personne;
		this.solde = solde;
	}
	
	public long getNumCompt() {
		return numCompt;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public Personne getPersonne() {
		return personne;
	}

	
	public List<OperationBancaire> getOperations() {
		return operations;
	}

	
	public void setOperations(List<OperationBancaire> operations) {
		this.operations = operations;
	}

	@Override
    public String toString() {
            return "Le compte n°"+this.getNumCompt()+" de Mr "+
                   this.getPersonne().getFullName() +" dispose de "+
                    this.getSolde()+" Fcfa";
    }

    public double depot(int montant, LocalDateTime date, String libelle) {
            this.setSolde(montant + this.getSolde());
            this.getOperations().add(new OperationBancaire(montant,date,libelle));
            return this.getSolde();
    }		

    public double retrait(int montant, String libelle, LocalDateTime date) throws Exception {
        if (montant > this.getSolde()) {
        	throw new Exception("Pas assez d'argent sur le compte");
        } else { 
        	this.setSolde(this.getSolde() - montant);
        	this.getOperations().add(new OperationBancaire(montant,date,libelle));
        	return this.getSolde();
        }
    }
    
    public String listeOperations(int n){
        Iterator<OperationBancaire> i = this.getOperations().iterator();
        int index = 0;
        String resultat = "";
        while (index < n && i.hasNext()) {
            resultat = resultat + i.next().toString() + "\n";
            index = index + 1;
        }
        return resultat;
    }
	
	
}
