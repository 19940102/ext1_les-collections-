package exr1.cl;

import java.util.ArrayList;
import java.util.List;

public class GestionProduit {
    public static void main(String[] args) {

    List<produit> produits=new ArrayList<>();
    produits.add(new produit(1,"HP",200000));
    produits.add(new produit(2,"DEL",1800000));
    produits.add(new produit(3,"MAC",150000));

    produits.remove(0);
    for (produit p:produits) {
        System.out.println(p);
    }
    System.out.println("******* Q4 ********");
produits.get(0).setPrix(250000);
for (produit p:produits) {
System.out.println(p);
 Scanner scanner =new Scanner(System.in);
System.out.println( "entrez un mot clé");
String keyWord=scanner.next();
for (produit p:produits){
    if (p.getNom().contains(keyWord)){
        System.out.println(p);
    }
}
}
}
  }  
