package week5_project;

class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class AccountTest{
	public static void main(String[] args) {
		//202221226 장민채
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(1000000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + " 입니다.");
	}
}