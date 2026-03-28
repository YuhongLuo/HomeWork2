package edu.npu.domain;

public class Account {

	int accountId;
	double balanceDue;
	//Date dueDate;
	public Account(int accountId) {
		super();
		this.accountId = accountId;
		
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
}
