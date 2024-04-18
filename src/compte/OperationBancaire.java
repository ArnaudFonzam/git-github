package compte;

import java.time.LocalDateTime;

public class OperationBancaire implements Comparable<OperationBancaire> {
    private final int montant;
    private final LocalDateTime dateOperation;
    private final String libelle;

    public OperationBancaire(int montant, LocalDateTime dateOperation, String libelle) {
        this.montant = montant;
        this.dateOperation = dateOperation;
        this.libelle = libelle;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDateTime getDateOperation() {
        return dateOperation;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return "Operation Bancaire { montant = " + montant + ", le "+ dateOperation + ", Action = " + libelle + "}";
    }

    @Override
    public int compareTo(OperationBancaire o) {
        int c = o.dateOperation.compareTo(this.dateOperation);
        if (c == 0) {
        	return o.libelle.compareTo(this.libelle);
        } else {
        	return c;
        }
    }
    
}