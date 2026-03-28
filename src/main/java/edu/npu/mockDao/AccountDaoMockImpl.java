package edu.npu.mockDao;

import java.util.List;

import edu.npu.domain.Account;

public class AccountDaoMockImpl {

	public double checkBalanceById() {
		return 20.0;
	}
	
	public Account creatNewAccount(int studentId) {
	
		Account a = new Account(studentId);
		a.setBalanceDue(0);
		return a;
		
	}
	
	public void addAmount(int studentId, double amount) {
		Account a = new Account(studentId);
		a.setBalanceDue(amount);
	}
	
	public List<Account> rechieveAccountId(){
	
		List<Account> a=null ;
		return a;
	}
}

      