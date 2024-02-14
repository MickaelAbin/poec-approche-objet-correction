package entites;

public class AdressePostale {

    private int numero;
    public String rue;
    public int codePostal;
    public String ville;

    public AdressePostale() {
        this(-1, "", 0, "");
    }

    public AdressePostale(String rue, int codePostal, String ville) {
        this(-1, rue, codePostal, ville);
    }

    public AdressePostale(int numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
