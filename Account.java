package capítulo2;



public  class Account {
	private String name;
	private double balance;
	
	
	public  Account( String name, double balance) {
		this.name=name;
		if(balance>0.0)
			this.balance=balance;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double depositAmount) {
		if(depositAmount>0.0)
		this.balance = balance+depositAmount;
	}
	
	public void withdraw(double débito)
	{
		if(débito<balance) {
			this.balance=balance-débito;
		}else {
			System.out.println("Valor de débito excedeu o saldo da conta");
		}
	}
	
     
	
	
	

}
