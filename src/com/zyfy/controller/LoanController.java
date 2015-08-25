package com.zyfy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyfy.bpo.LoanBpo;
import com.zyfy.vo.LoanVO;


@Controller
public class LoanController {
	
	@Autowired
	private LoanBpo loanBpo;
	
	 @RequestMapping(value="loan") 
	 	private @ResponseBody List<LoanVO>  hello(LoanVO loanVO){ 
	        return loanBpo.getLoan();  
	    }
}
