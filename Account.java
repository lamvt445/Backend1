package BA;

public abstract class Account {
	public double balance;
	public int transactions;
	
	public Account(double balance) {
		this.balance = balance;
		this.transactions = 0;
				
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}else {
			System.out.println("tai khoan phai duong");
		}
	}
	public int getTransactions() {
		return transactions;
	}
	public void setTransactions(int transactions) {
			transactions = 0;
			this.transactions = transactions;
		
	}
	public void deposit(double amount) {
		balance += amount;
		transactions++;
	}
	public void withdraw(double amount) {
		balance -= amount;
		transactions++;
	}
	public void endMonth() {
		endMonthCharge();
		System.out.println("Balance: "+ this.balance + "DOLA");
		System.out.println("Transactions: "+ this.transactions);
		this.transactions = 0;
	}
	public abstract void endMonthCharge();
}
