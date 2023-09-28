package week5_project;
class BankAccount{
	int accountNumber;
	String name;
	int balance;
	@Override
	public String toString() {
		return "현재 잔액은 " + balance + " 입니다. ";
	}
	
	public void deposit(int i) {
		balance+=i;
	}
	public void withdraw(int i) {
		balance-=i;
	}
	
}
public class BankAccountTest {
	public static void main(String[] args) {
		// 202221226 장민채
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(4000);
		System.out.println(myAccount);
	}

}
