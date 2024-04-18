package animaux;


class Chien extends Animal {
    public Chien(String nom, int age, String sexe) {
        super(nom, age, sexe);
    }

    public void aboyer() {
        System.out.println(this.getNom() + " aboie.");
    }
}