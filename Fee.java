package BA;

public class Fee extends Account{
	public Fee(double balance) {
		super(balance);
	}
	@Override
	
	public void endMonthCharge() {
		this.balance -= 5;
		if(this.balance<=0) {
			this.balance = 0;
		}
	}
}
