import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produit produit=new Produit("stylo",1,3);
        Produit produit2=new Produit("cahier",4,6);
        Magasin m=new Magasin(30);
        m.ajouterProduit("stylo",1,3);
        m.addProduit(produit);
        m.addProduit(produit2);
        System.out.println(m);
        m.addProduit(produit);
        m.addProduit(produit);
        m.addProduit(produit);
        m.addProduit(produit);

        System.out.println(" Le produit que vous cherchez : "+m.rechercherProduit("stylo"));
        System.out.println(" le mot que vous cherchez : "+m.rechercherProduit("stylo"));
        int ref=m.getStockProduit().indexOf(produit);
        m.acheterProduit(ref,2);
        System.out.println(produit);
        m.vendreProduit(ref,1);
        System.out.println(produit);

        Produit P1=new Produit("A",10,15);
        Produit P2=new Produit("B",15,17);
        Livre L1=new Livre("Livre1",17,19,"Alpha","AlphaB");
        CD cd=new CD("cd",12,18,"BETA","BETA");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Voulez-vous ajouter un produit, un livre, un CD ? \n 1- Produit \n 2- Livre \n 3- CD ");
        System.out.println("Voici la listes des produits qu'ils y a a ajouter !\n P1 , L1, cd");
        int choix=scanner.nextInt();
        switch (choix){
            case 1:
                m.addProduit(P1);
                System.out.println("produit P1 a été ajouté");
                break;
            case 2:
                m.addProduit(L1);
                System.out.println("produit L1 a été ajouté");
                break;
            case 3:
                m.addProduit(cd);
                System.out.println("produit cd a été ajouté");
                break;
        }

    }
}
