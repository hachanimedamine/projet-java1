package basehachani;
import hachani.commande;
import hachani.categorie;
import hachani.product_commande;
import hachani.produit;
import hachani.utilisateur;
import service.gestioncategorie;
import service.gestioncommande;
import service.gestionproduit;
import service.gestionutilisateur;

public class main {
	public static void main(final String[] args){
		gestioncategorie gestcat = new gestioncategorie();
		gestionutilisateur gestutili = new gestionutilisateur();
		gestionproduit gestprod = new gestionproduit();
		gestioncommande gestcomm = new gestioncommande();
		
		// GESTION Categorie ------------------------------------------------------

        // SELECT CATEGORIE
//gestCat.SelectCat();

       //DELETE CATEGORIE
//categorie catTobedeleted = new categorie(1,"pc gaming");
//gestCat.DeleteCat(catTobedeleted);

       //INSERT CATEGORIE
//categorie catTobeinserted = new categorie(0,"pc gaming NEW","aaaaaaaaaaaaaaa","hachani");
//gestCat.InsertCat(catTobeinserted);
       //UPDATE CATEGORIE
//categorie catTobeupdated = new categorie(3,"pc gaming Updated","zzzzzzzzzzzzzzz","hachani medamine");
//gestCat.UpdateCat(catTobeupdated);












// SELECT UTILISATEUR
//gestutili.Selectutilisateur();
//INSERT UTILISATEUR
utilisateur utilitobeinsrted =  new utilisateur(6, "hacahni U", "new pseudo", "123456", "99999999", "admin",6);	    
gestutili.Insertutilisateur(utilitobeinsrted);
    //DELETE UTILISATEUR
//utilisateur utilisateurtobedeleted = new utilisateur(2, null, null, null, null, null, 0);
//gestutili.Deleteutilisateur(utilisateurtobedeleted);
//UPDATE UTILISATEUR
//utilisateur utilisateurtobeupdated =  new utilisateur(2, " Update", "new pseudo", "123456", "99999999", "admin",1);	
//gestutili.Updateutilisateur(utilisateurtobeupdated);







  //DELETE PRODUIT
//produit prodTobeDeleted = new produit(3);
//gestprod.DeleteProd(prodTobeDeleted);
  //INSERT PRODUIT
//produit prodtobeinserted = new produit(5, "New One", "New One", "New One", "New One", "New One", cat);
//gestprod.insertproduit(prodtobeinserted);
     //UPDATE PRODUIT
//produit prodtobeupdated = new produit(5, "New One", "New One", "New One", "New One", "New One", cat);
//gestprod.UpdateProduit(prodtobeupdated);
    //SELECT PRODUIT
//gestprod.SelectProduit();











//INSERT COMMANDE
//utilisateur uti = new utilisateur(5);
//commande comm = new commande(1, "test comm UP", "test comm",uti );
//produit prod = new produit(3);
//gestcomm.InsertCommande(comm, prod);

//DELETE COMMANDE
//commande commtobedeleted = new commande(1, "test comm UP", "test comm",uti );
//gestcomm.DeleteCommande(comm);

//SELECT COMMANDE
//gestcomm.SelectCommande();

//UPDATE COMMANDE
//utilisateur uti = new utilisateur(5);
//commande comm = new commande(1, "test comm UP", "test comm",uti );
//produit prod = new produit(3);
//gestcomm.UpdateCommande(comm, prod);



}
}
