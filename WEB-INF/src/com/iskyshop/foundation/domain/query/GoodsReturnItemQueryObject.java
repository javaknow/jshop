package com.iskyshop.foundation.domain.query;

import org.springframework.web.servlet.ModelAndView;

import com.iskyshop.core.query.QueryObject;

public class GoodsReturnItemQueryObject extends QueryObject {
	public GoodsReturnItemQueryObject(String construct, String currentPage,
			ModelAndView mv, String orderBy, String orderType) {
		super(construct, currentPage, mv, orderBy, orderType);
		// TODO Auto-generated constructor stub
	}

	public GoodsReturnItemQueryObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsReturnItemQueryObject(String currentPage, ModelAndView mv,
			String orderBy, String orderType) {
		super(currentPage, mv, orderBy, orderType);
		// TODO Auto-generated constructor stub
	}
	
}