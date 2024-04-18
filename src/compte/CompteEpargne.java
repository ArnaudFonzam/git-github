package compte;


public class CompteEpargne extends Compte {
    private float tauxInterets;
    
    public CompteEpargne(Personne proprietaire,float taux) {
        super(proprietaire, 0.0);
        tauxInterets=taux;
    }

    public float getTauxInterets() {
        return tauxInterets;
    }
    
    public double calculInterets() {
        return this.getSolde() + this.getSolde() * this.tauxInterets;
    }
}

