package BA;



public class mainRun {
	
	public static void main(String[] args) {
		Fee acc1 = new Fee(100);
		NickleNDime acc2 = new NickleNDime(15000);
		Gambler acc3 = new Gambler(20000);

		acc1.deposit(200);
		acc1.withdraw(123);
		System.out.println("Fee account:");
		acc1.endMonth();
		System.out.println();

		acc2.deposit(125000);
		acc2.withdraw(5400);
		acc2.withdraw(12000);
		System.out.println("NickleNDime account");
		acc2.endMonth();
		System.out.println();

		acc3.deposit(1000000);
		acc3.withdraw(89000);
		acc3.withdraw(675);
		acc3.withdraw(12000);
		System.out.println("Gambler account");
		acc3.endMonth();
		System.out.println();
	}
}
