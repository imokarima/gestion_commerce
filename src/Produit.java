public class Produit {
    private String nom;
    private double prixAchat;
    private double prixVente;
    private int nbStock=0;
    private String description;

    public Produit(String nom,double prixAchat,double prixVente){
        this.nom=nom;
        this.prixAchat=prixAchat;
        this.prixVente=prixVente;
        this.nbStock++;
        this.description="Pas de description";
    }

    public String toString(){
        return " Le produit : "+this.getNom()+" a été acheté : "+this.prixAchat+" son prix de vente est : "+this.prixVente+" le stock est : "+this.nbStock+" description : "+this.description+" \n";
    }

    public String getNom() {
        return nom;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public int getNbStock() {
        return nbStock;
    }

    public String getDescription() {
        return description;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
