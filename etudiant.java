public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String matricule;

    public Etudiant(String nom, String prenom, int age, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Matricule: " + matricule);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 20, "123456");
        etudiant1.afficher();
    }
}
