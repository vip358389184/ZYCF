package com.zyfy.service;

import java.util.List;

import com.zyfy.pojo.Loan;
import com.zyfy.util.page.Page;

public interface LoanService {
	public List<Loan> getLoan(Page<Loan> page);
}
