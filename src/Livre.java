public class Livre extends Produit{
    private String auteur;
    private String editeur;

    public Livre(String nom, double prixAchat, double prixVente,String auteur,String editeur) {
        super(nom, prixAchat, prixVente);
        this.auteur=auteur;
        this.editeur=editeur;
    }

    @Override
    public String getDescription() {
        return " L'auteur du Livre est : "+this.auteur+ " et l'editeur : "+this.editeur+super.getDescription();
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }
}
