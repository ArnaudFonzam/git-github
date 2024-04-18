package animaux;


class Chat extends Animal {
    public Chat(String nom, int age, String sexe) {
        super(nom, age, sexe);
    }

    public void miauler() {
        System.out.println(getNom() + " miaule.");
    }
}
