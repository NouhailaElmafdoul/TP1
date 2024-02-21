import java.util.Arrays;

public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    private double[] notes; // Tableau de notes

    public Etudiant(String nom, String prenom, int age, String matricule, double[] notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
        this.notes = notes;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Matricule: " + matricule);
        System.out.println("Notes: " + Arrays.toString(notes));
    }

    public static void main(String[] args) {
        double[] notesEtudiant1 = { 15.5, 12.0, 17.5 };
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 20, "123456", notesEtudiant1);
        etudiant1.afficher();
    }
}

