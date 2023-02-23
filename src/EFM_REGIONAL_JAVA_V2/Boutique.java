package EFM_REGIONAL_JAVA_V2;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Boutique {
    ArrayList<Produit> listeArticle = new ArrayList();

    public Boutique() {
    }

    public void ajouter(Produit p) throws Exception {
        if (this.listeArticle.contains(p)) {
            throw new Exception("this article already exists");
        } else {
            this.listeArticle.add(p);
        }
    }

    public int idiceDe(int code) {
        int indice = -1;

        for(int i = 0; i < this.listeArticle.size(); ++i) {
            if (((Produit)this.listeArticle.get(i)).getCode() == code) {
                indice = i;
            }
        }

        return indice;
    }

    public boolean supprimer(int code) {
        boolean isSupprimer = false;
        Iterator var3 = this.listeArticle.iterator();

        while(var3.hasNext()) {
            Produit i = (Produit)var3.next();
            if (i.getCode() == code) {
                this.listeArticle.remove(i);
                isSupprimer = true;
                break;
            }
        }

        return isSupprimer;
    }

    public boolean supprimer(Produit p) {
        if (this.listeArticle.contains(p)) {
            this.listeArticle.remove(p);
            return true;
        } else {
            return false;
        }
    }

    public int nobreArticleEnSolde() {
        int nobreArticleEnSolde = 0;
        Iterator var2 = this.listeArticle.iterator();

        while(var2.hasNext()) {
            Produit i = (Produit)var2.next();
            if (i.getClass() == ProduitEnSolde.class) {
                ++nobreArticleEnSolde;
            }
        }

        return nobreArticleEnSolde;
    }

    public void enregistrer(String chemin) throws IOException {
        File myfile = new File(chemin);
        FileWriter fileWriter = new FileWriter(myfile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(this.listeArticle);
        printWriter.close();
    }

    public void supprimerFichier(String chemin) throws IOException {
        File myfile = new File(chemin);
        myfile.delete();
    }
}
