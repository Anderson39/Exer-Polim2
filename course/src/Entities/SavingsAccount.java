package Entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;

	 public SavingsAccount() {
		 super();
	 }

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	  //m�todo para atualizar meu saldo de juro
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
	 

