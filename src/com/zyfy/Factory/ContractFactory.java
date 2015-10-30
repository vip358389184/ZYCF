package com.zyfy.Factory;

import java.util.ArrayList;
import java.util.Collection;

import com.zyfy.vo.ContractModel;

public class ContractFactory {
	 public static Collection<ContractModel> createBeanCollection() {
	        Collection<ContractModel> beanCollection = new ArrayList<ContractModel>();
	            beanCollection.add(createModel());
	        return beanCollection;
	    }
	 
	 public static ContractModel createModel() {
		 ContractModel model=new ContractModel();
		 model.setA_name("于文扬");
		 model.setB_name("逯总");
		 return model;
	    }
	 
}
