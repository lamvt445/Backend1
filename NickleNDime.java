package BA;

public class NickleNDime extends Account {
	public int withDrawCount;
	public NickleNDime(double balance) {
		super(balance);
		this.withDrawCount = 0;
	}
	public int getWithDraws() {
		return withDrawCount;
	}
	public void setWithDraws(int withDrawCount) {
			
			this.withDrawCount = withDrawCount;
		
	}
	@Override
	public void withdraw(double amount) {
		withDrawCount++;
		this.balance -= amount;
		transactions++;
	}
	@Override
	public void endMonthCharge() {
		this.balance -= (this.getWithDraws()*0.5);
		if(this.balance<=0) {
			this.balance = 0;
		}
	}
}
