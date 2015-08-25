package com.zyfy.dao;

import java.util.List;

import com.zyfy.pojo.Loan;
import com.zyfy.util.page.Page;

public interface LoanDao {
		public List<Loan> getLoan(Page<Loan> page);
}
