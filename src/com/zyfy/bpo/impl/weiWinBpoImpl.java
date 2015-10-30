package com.zyfy.bpo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zyfy.bpo.WeiWinBPO;
import com.zyfy.service.WeiWinService;

public class weiWinBpoImpl implements WeiWinBPO {
	
	@Autowired
	private WeiWinService weiWinserver;
	
	@Override
	public String newProject() {
		
		return null;
	}

	@Override
	public String moneyChange() {
		return null;
	}

	@Override
	public String enroll() {
		return null;
	}

	@Override
	public String newActivity() {
		return null;
	}

}
