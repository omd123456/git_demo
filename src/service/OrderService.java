package service;

import java.util.List;


import entity.Order;
import entity.Page;

public interface OrderService {
	/**
	 * 查看订单全部信息
	 * @param name
	 * @param ment
	 * @param page
	 * @return
	 */
    public List<Order> query(String name,String ment,Page page);
	
    /**
     * 计算总页数
     * @param name
     * @param ment
     * @return
     */
	public int count(String name,String ment);
	
	/**
	 * 查询总记录数
	 * @param name
	 * @param ment
	 * @return
	 */
	public int count1(String name, String ment);
}
