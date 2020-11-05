package BA;

import java.util.Random;

public class Gambler extends Account{
	Random vTL = new Random();
	public Gambler(double balance) {
		super(balance);
	}
	@Override
	public void withdraw(double amount) {
		int val = vTL.nextInt(99)+1;
		if(val>=1 && val<=100) {
			if(val<=49) {
				this.transactions++;
			}else if(val == 50) {
				this.balance-=amount;
				this.transactions++;
			}else {
				this.balance-=amount*2;
				this.transactions++;
			}
		}
		
	}
	public void endMonthCharge() {
		
	}
}
