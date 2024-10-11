package capítulo2;

public class Invoice {
	private String numero;
	private String descrição;
	private int qtdI;
	private double preço;
	
	public Invoice(String numero,String descrição,int qtdI,double preço){
		this.numero=numero;
		this.descrição=descrição;
		if(qtdI>0) 
		this.qtdI=(qtdI>0) ? qtdI : 0;
		this.preço=(preço>0.0) ? preço : 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	
	public int getQtdI() {
		return qtdI;
	}

	public void setQtdI(int qtdI) {
		
		this.qtdI = (qtdI>0) ? qtdI :0;
	}

	
	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = (preço>0)?preço:0.0;
	}
	
	public double getInvoiceAmount() {
		
		return preço*qtdI;
	}
	
}
