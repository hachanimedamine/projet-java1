package hachani;

public class product_commande {
	private commande commande;
	private produit produit;
	public product_commande(hachani.commande commande, hachani.produit produit) {
		super();
		this.commande = commande;
		this.produit = produit;
	}
	public commande getCommande() {
		return commande;
	}
	public void setCommande(commande commande) {
		this.commande = commande;
	}
	public produit getProduit() {
		return produit;
	}
	public void setProduit(produit produit) {
		this.produit = produit;
	}
	@Override
	public String toString() {
		return "product_commande [commande=" + commande + ", produit=" + produit + "]";
	}
	
	

}
