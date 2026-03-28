package edu.npu.dao;

import java.util.List;

import edu.npu.domain.Account;

public interface accountDao {
	
	public double checkBalanceById();
	public double checkBalanceByName();
	public List<Account> rechieveAccountId();
	public Account creatNewAccount(int studentId);
}
