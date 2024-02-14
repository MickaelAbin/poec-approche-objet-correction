package entites;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne() {
    }

    public Personne(String nom) {
        this(nom, "", new AdressePostale());
    }

    public Personne(String nom, String prenom) {
        this(nom, prenom, new AdressePostale());
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase();
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase();
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public void afficherNomEtPrenom() {
        System.out.println(nom + " " + prenom);
    }
    public void afficher() {
        System.out.printf("Le nom de l'objet est %s%n et son prénom est %s%n", nom, prenom);
        System.out.println("Le nom de l'objet est "+nom+"\n et son prénom est "+prenom);
    }
}
