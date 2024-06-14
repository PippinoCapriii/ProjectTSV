package it.unisa.model;

public class ItemCarrello {

	public ItemCarrello(ProductBean prodotto){
		this.prodotto = prodotto;
		quantitąCarrello = 1;
	}
	
	public ProductBean getProdotto() {
		return prodotto;
	}
	
	public void setProdotto(ProductBean prodotto) {
		this.prodotto = prodotto;
	}
	
	public int getQuantitąCarrello() {
		return quantitąCarrello;
	}
	
	public void setQuantitąCarrello(int quantitą) {
		this.quantitąCarrello = quantitą;
	}
	
	public int getId() {
		return prodotto.getIdProdotto();
	}
	
	public double getTotalPrice() {
		return quantitąCarrello * prodotto.getPrezzo();
		

	}
	
	public String getDescription() {
		return prodotto.getDescrizione();
	}
	
	public void incrementa() {
		if(quantitąCarrello < prodotto.getQuantitą() )
			quantitąCarrello = quantitąCarrello + 1;
	}
	
	public void decrementa() {
		if( quantitąCarrello > 1)
			quantitąCarrello = quantitąCarrello - 1;
	}
	
	private ProductBean prodotto;
	private int quantitąCarrello;
}