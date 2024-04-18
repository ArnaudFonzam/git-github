package forme;


public class Rectangle extends FormeGeometrique {

	private double longueur;
	private double largeur;
	
	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public double getLargeur() {
		return largeur;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public Rectangle(String nom, double longueur, double largeur)  {
		super(nom);
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	@Override
	public void surface() {
		System.out.println("la surface du rectangle de nom "+this.getNom()+" est "+ this.largeur * this.longueur);
	}
	
	@Override
	public void perimetre() {
		System.out.println("le périmètre du carré de nom "+this.getNom()+" est "+ (this.largeur + this.longueur) * 2);
	}
}
