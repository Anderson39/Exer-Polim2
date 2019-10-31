package Entities;
//com isso estou definindo que minha classe ter� todos os dados e comportamento da minha classe Account
public class BusinessAccount extends Account {
	
	private Double loanLimit;
 
	public BusinessAccount() {
		super();
	}
	
	// o super � pra execultar a l�gica do construtor da classe base
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
		@Override
		public void withdraw (double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
		
	}
}
