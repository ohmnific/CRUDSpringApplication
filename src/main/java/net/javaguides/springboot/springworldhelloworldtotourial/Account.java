package net.javaguides.springboot.springworldhelloworldtotourial;

public class Account {

    private int accountNumber;
	private String firstName;
    private String branchName;
    private int balance;
    
    public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public Account(int accountNumber, String firstName, String branchName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.branchName = branchName;
		this.balance = balance;
	}

    
}
