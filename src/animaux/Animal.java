package animaux;


public class Animal {
	
	private String nom;
    private int age;
    private String sexe;

	public Animal(String nom, int age, String sexe) {
		 this.nom = nom;
	     this.age = age;
	     this.sexe = sexe;
	}

	public void manger() {
        System.out.println(this.getNom() + " mange.");
    }

    public void dormir() {
        System.out.println(this.getNom() + " dort.");
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }
	
}
