package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String hold) {
	
		this.number = number;
		this.holder = hold;
	}

	public Account(int number, String holder, double initialDeposit) {
	
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	

	public String getHold() {
		return holder;
	}

	public void setHold(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $  "
				+ String.format("%.2f", balance);
				
	}
	
	
	
	

}
