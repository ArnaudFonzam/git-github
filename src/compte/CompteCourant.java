package compte;

import java.time.LocalDateTime;

public class CompteCourant extends Compte {
    private double montantDecouvertAutorise;
    
    public CompteCourant(Personne proprietaire, double decouvert) {
        super(proprietaire, decouvert);
        montantDecouvertAutorise=decouvert;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }
    
    @Override
    public double retrait(int montant,String libelle, LocalDateTime date) throws Exception {
        if (montant > this.getSolde() + this.montantDecouvertAutorise) {
        	throw new Exception("Pas assez d'argent sur le compte");
        } else {
        	this.setSolde(this.getSolde() - montant);
            this.getOperations().add(new OperationBancaire(montant, date, libelle));
            return this.getSolde();
        }
    }

}
