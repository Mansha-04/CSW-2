abstract class Account{
	private int accNum;
	private double bal;
	Account(int accNum,double bal){
		this.accNum=accNum;
		this.bal=bal;
	}
	public abstract void deposit(double amt);
	public abstract void withdraw(double amt);
	public double getBal() {
		return bal;
	}
	public void setBal() {
		this.bal=bal;
	}
}
class Sav extends Account{
	double rate;
	Sav(int accNum,double bal,double rate){
		super(accNum,bal);
		this.rate=rate;
	}
	public void deposit(double amt) {
		double Int=amt*(rate/100);
		double tot=amt+Int;
		double bal=getBal()+tot;
		System.out.println("deposit:"+amt+"interest:"+rate+"bal:"+bal);
	}
	public void withdraw(double amt) {
		if(amt>getBal()) {
			System.out.println("insufficient");
		}
		else {
			System.out.println("bal:"+(getBal()-amt));
		}
	}
}
class Cur extends Account{
	double od;
	Cur(int accNum,double bal,double od){
		super(accNum,bal);
		this.od=od;
	}
	public void deposit(double amt) {
		System.out.println(getBal()+amt);
	}
	public void withdraw(double amt) {
		if(amt>getBal() && (amt-getBal())>od){
			System.out.println("overdraft limit exceeded");
		}
		else {
			System.out.println(getBal()-amt);
		}
	}
}
public class Q7 {

	public static void main(String[] args) {
		Sav s=new Sav(102,3000,5);
		Cur c=new Cur(138,5000,3000);
		s.deposit(10000);
		s.withdraw(20000);
		c.deposit(200);
		c.withdraw(80000);
	}

}
