package forme;


public class FormeGeometrique {

	private String nom;
	
	public FormeGeometrique(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom)  {
		this.nom = nom;
	}
	
	public void  surface() {
		System.out.println("calcul de la surface");
	}
	
	public void perimetre() {
		System.out.println("calcul du périmètre");
	}
}
