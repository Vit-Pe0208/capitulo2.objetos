package capítulo2;

public class Date {
	private int mês,dia,ano;
	
	public Date(int dia,int mês,int ano) {
		
		if(mês>0 && mês <13)
			this.mês=mês;
		if(dia>0 && dia<31)
			this.dia=dia;
		if(ano>0 && ano<2024)
			this.ano=ano;
		
	}

	public int getMês() {
		
		return mês;
	}

	public void setMês(int mês) {
		
		if(mês>0 && mês <13)
		this.mês = mês;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		
		if(dia>0 && dia<31)
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano>0 && ano<2024)
		this.ano = ano;
	}
	
	public void displayDate(Date date) {
		
		System.out.printf("%02d/%02d/%04d%n",date.getDia(),date.getMês(),date.getAno());
	}
	
	

}
