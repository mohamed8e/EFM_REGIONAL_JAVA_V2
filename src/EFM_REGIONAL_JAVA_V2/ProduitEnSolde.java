package EFM_REGIONAL_JAVA_V2;

public class ProduitEnSolde extends Produit {
    int remise;

    ProduitEnSolde(int code, double prix, int remise) throws Exception {
        super(code, prix);
        if (remise <= 90 && remise >= 0) {
            this.remise = remise;
        } else {
            throw new Exception("la remise est invalide");
        }
    }

    public int getRemise() {
        return this.remise;
    }

    public void setRemise(int remise) throws Exception {
        this.remise = remise;
    }

    public double prixArticle() {
        return this.getPrix() * (double)this.remise / 100.0;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "; remise = " + this.remise;
    }
}
