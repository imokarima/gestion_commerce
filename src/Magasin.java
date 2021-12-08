import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private double solde;
    private List<Produit> stockProduit;

    public Magasin(double solde) {
        this.solde = solde;
        this.stockProduit = new ArrayList<>();
    }


    public void ajouterProduit(String nom, double prixAchat, double prixVente) {
        this.stockProduit.add(new Produit(nom, prixAchat, prixVente));

    }
    public void addProduit(Produit p){
        this.stockProduit.add(p);
        p.setNbStock(1);
    }

    public void acheterProduit(int referenceProduit, int nombreExemplaire) {
        Produit produit=this.stockProduit.get(referenceProduit);
        produit.setNbStock(nombreExemplaire);
    }

    public void vendreProduit(int referenceProduit,int nombreExemplaire){
        Produit produit=this.stockProduit.get(referenceProduit);
        produit.setNbStock( produit.getNbStock()-nombreExemplaire);
    }


    public Produit rechercherProduit(String nom){
        for(Produit p:stockProduit){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
       return null;
    }

    public Produit rechercherProduitParMot(String mot){
        for(Produit p:stockProduit){
            if(p.getDescription().contains(mot)){
                return p;
            }
        }
        return null;
    }

    public String toString(){
        String s="Liste des produits dans le magasin : ";
        for(Produit p:stockProduit){
            s= s+p.toString();
        }
        return s;
    }
    public double bilan(){// a revoir
        return 0;
    }
    public List<Produit> getStockProduit() {
        return stockProduit;
    }

    public double getSolde() {
        return solde;
    }


}
