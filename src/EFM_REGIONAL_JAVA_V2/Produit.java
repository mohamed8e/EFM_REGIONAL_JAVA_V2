package EFM_REGIONAL_JAVA_V2;

public class Produit {
    private int code;
    private double prix;

    Produit(int code, double prix) {
        this.code = code;
        this.prix = prix;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Produit : code=" + this.code + "; solde = " + this.prix;
    }

    public boolean equals(Produit obj) {
        return this.code == obj.code;
    }

    public double prixArticle() {
        return this.prix;
    }
}
