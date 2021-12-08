import java.util.HashSet;
import java.util.Set;

public class CD extends Produit{
    private String auteur;
    private String interprete;
    private Set<String> ensPistes;
    public CD(String nom, double prixAchat, double prixVente,String auteur,String interprete) {
        super(nom, prixAchat, prixVente);
        this.auteur=auteur;
        this.interprete=interprete;
        this.ensPistes=new HashSet<>();
    }
    @Override
    public String getDescription() {
        String pistes="";
        for(String st:ensPistes){
           pistes+=" [ "+st+" ] ";
        }
        return " L'auteur du CD est : "+this.auteur+ " et l'interprete : "+pistes+this.interprete+super.getDescription();
    }


    public String getAuteur() {
        return auteur;
    }

    public String getInterprete() {
        return interprete;
    }

    public Set<String> getEnsPistes() {
        return ensPistes;
    }
}
