package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import entity.Order;
import entity.Page;

import service.OrderService;


@Controller
@RequestMapping("/user")  //���ģ�飬�ǽ���������·��������ͬ
public class IndexController{

	@Autowired
	//@Qualifier("orderService")
	private OrderService orderService;
	@RequestMapping("/index")
	public String Query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		String queryProductName = request.getParameter("queryProductName");
		String queryIsPayment = request.getParameter("queryIsPayment");
		
		int ye = 1;
		String pageindex = request.getParameter("pageIndex");
		System.out.println(pageindex);
		if (pageindex != null) {
			ye = Integer.valueOf(pageindex);
		}
		if (queryIsPayment == null || queryIsPayment.equals("0")) {
			queryIsPayment ="";
		}
		if (queryIsPayment != null || !"0".equals(queryIsPayment)) {
			request.getSession().setAttribute("queryUserRole", queryIsPayment);
		}
		Page page = new Page();
		
		int i = orderService.count(queryProductName, queryIsPayment);
		int ii = orderService.count1(queryProductName, queryIsPayment);
		if (ye>ii) {
			ye = ii;
		}
		
		
		page.setTotalCount(i);
		request.setAttribute("totalCount", ii);
		page.setTotalPageCount(ii);
		request.setAttribute("totalPageCount", i);
		page.setCurrentPageNo(ye);
		request.setAttribute("currentPageNo", ye);
		request.setAttribute("queryProductName", queryProductName);
		request.setAttribute("queryIsPayment",queryIsPayment );
		List<Order> list = orderService.query(queryProductName, queryIsPayment, page);
		
		//request.setAttribute("page",page);
		request.setAttribute("billList", list);
		
		return "billlist";
	}
}
