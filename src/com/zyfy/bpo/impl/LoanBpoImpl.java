package com.zyfy.bpo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfy.bpo.LoanBpo;
import com.zyfy.pojo.Loan;
import com.zyfy.service.LoanService;
import com.zyfy.util.enums.LoanStatus;
import com.zyfy.util.enums.RepaymentMethod;
import com.zyfy.util.page.Page;
import com.zyfy.util.util.ProFile;
import com.zyfy.vo.LoanVO;

@Service
public class LoanBpoImpl implements LoanBpo {

	@Autowired
	public LoanService loanService;

	@Override
	public List<LoanVO> getLoan() {
		List<Loan> loanList = loanService.getLoan(new Page<Loan>());
		LoanVO loanvo;
		List<LoanVO> returnList = new ArrayList<LoanVO>();
		for (Loan loan : loanList) {
			loanvo = new LoanVO();
			loanvo.setId(loan.getID());
			loanvo.setName(loan.getTITLE());
			loanvo.setBorrow_url(ProFile.getCreditMarket() + "/loan/" + loan.getID());
			loanvo.setGuarant_mode(2);
			loanvo.setGuarantors("湖北大别山融资担保有限公司");
			loanvo.setAccount(Float.valueOf(loan.getAMOUNT()));
			loanvo.setTender_num(loan.getBID_NUMBER());
			loanvo.setProgress(String.valueOf((float) loan.getBID_AMOUNT() / (float) loan.getAMOUNT()));
			loanvo.setPublish_time(loan.getTIMEOPEN());
			loanvo.setStart_time(loan.getTIMEOPEN());
			loanvo.setEnd_time(loan.getTIMEFINISHED());
			loanvo.setRepay_start_time(loan.getTIMESETTLED());
			loanvo.setRepay_end_time(loan.getTIMECLEARED());
			loanvo.setBorrow_type(1);
			loanvo.setApr((float) (loan.getRATE() / 10000.0));
			loanvo.setStart_price(100);
			loanvo.setStep_price(0);
			loanvo.setAccount_yes(Float.valueOf(loan.getBID_AMOUNT()));
			if (loan.getDAYS() != 0) {
				loanvo.setBorrow_time(loan.getDAYS());
				loanvo.setBorrow_time_unit(1);
			} else {
				if (loan.getMONTHS() != 0) {
					loanvo.setBorrow_time(loan.getMONTHS());
				} else {
					loanvo.setBorrow_time(12);
				}
				loanvo.setBorrow_time_unit(2);
			}
			
			int status = 6;
			if (LoanStatus.FAILED.equals(loan.getSTATUS())) {
				status = -1;
			}
			if (LoanStatus.OPENED.equals(loan.getSTATUS())) {
				status = 0;
			}
			if (LoanStatus.FINISHED.equals(loan.getSTATUS())) {
				status = 1;
			}
			if (LoanStatus.SETTLED.equals(loan.getSTATUS())) {
				status = 2;
			}
			if (LoanStatus.SCHEDULED.equals(loan.getSTATUS())) {
				status = 3;
			}
			if (LoanStatus.CLEARED.equals(loan.getSTATUS())) {
				status = 4;
			}
			if (LoanStatus.OVERDUE.equals(loan.getSTATUS())) {
				status = 5;
			}
			loanvo.setStatus(status);
			

			StringBuffer payTyep = new StringBuffer();
			boolean i = false;
			if (RepaymentMethod.MonthlyInterest.equals(loan.getMETHOD())) {
				if (i) {
					payTyep.append(",").append("1");
				} else {
					payTyep.append("1");
					i = true;
				}
			}
			if (RepaymentMethod.EqualInstallment.equals(loan.getMETHOD())) {
				if (i) {
					payTyep.append(",").append("3");

				} else {
					payTyep.append("3");
					i = true;
				}
			}
			if (RepaymentMethod.BulletRepayment.equals(loan.getMETHOD())) {
				if (i) {
					payTyep.append(",").append("7");

				} else {
					payTyep.append("7");
					i = true;
				}
			}
			loanvo.setPay_type(payTyep.toString());
			returnList.add(loanvo);
		}
		return returnList;
	}

}
