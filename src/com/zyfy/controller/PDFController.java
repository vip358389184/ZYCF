package com.zyfy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.zyfy.Factory.ContractFactory;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;



@Controller
public class PDFController {
	@RequestMapping(value = "report", method = RequestMethod.GET)
	public String report(Model model) {
		JRDataSource jrDataSource = new JRBeanCollectionDataSource(ContractFactory.createBeanCollection());
		model.addAttribute("url", "/WEB-INF/jasper/contract.jasper");
		model.addAttribute("format", "pdf");
		model.addAttribute("jrMainDataSource", jrDataSource);
		return "reportView";
	}
}