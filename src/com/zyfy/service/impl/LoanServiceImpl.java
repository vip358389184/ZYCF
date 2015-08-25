package com.zyfy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfy.dao.LoanDao;
import com.zyfy.pojo.Loan;
import com.zyfy.service.LoanService;
import com.zyfy.util.page.Page;

@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired
    private  LoanDao loanDao;
	
	@Override
	public List<Loan> getLoan(Page<Loan> page) {
		return loanDao.getLoan(page);
	}
		
}
