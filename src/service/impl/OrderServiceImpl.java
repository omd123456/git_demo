package service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderDao;
import entity.Order;
import entity.Page;
import service.OrderService;

@Service("orderService")	
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
    /**
     * �鿴ȫ����Ϣ
     * @param name
     * @param ment
     * @param page
     * @return
     */
	@Override
	public List<Order> query(String name, String ment, Page page) {
		List<Order> list = new ArrayList<Order>();
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("name",name);
		map.put("isPayment",ment);
		map.put("currentPageNo",(page.getCurrentPageNo()-1)*5);
		list = orderDao.query(map);
		return list;
	}
	/**
	 * ������ҳ��
	 * @param name
	 * @param ment
	 * @return
	 */
	@Override
	public int count(String name, String ment) {
		int count = 0;
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("name", name);
		map.put("isPayment", ment);
		int count1 = orderDao.count(map);
		count = count1%5==0?count1/5:(count1/5)+1;
		return count;
	}
	/**
	 * ��ѯ�ܼ�¼��
	 * @param name
	 * @param ment
	 * @return
	 */
	@Override
	public int count1(String name, String ment) {
		int count1 = 0;
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("name", name);
		map.put("isPayment", ment);
		count1 = orderDao.count1(map);
		return count1;
	}
	
	
	

}
