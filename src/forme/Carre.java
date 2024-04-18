package forme;


public class Carre extends FormeGeometrique{

	private double cote;
	
	public Carre(String nom, double cote) {
		super(nom);
		this.cote = cote;
	}
	
	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
	@Override
	public void surface() {
		System.out.println("la surface du carré de nom "+this.getNom()+" est "+ this.cote * this.cote);
	}
	
	@Override
	public void perimetre() {
		System.out.println("le périmètre du carré de nom "+this.getNom()+" est "+ this.cote * 4);
	}
	
}
