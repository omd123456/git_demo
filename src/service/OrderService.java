package service;

import java.util.List;


import entity.Order;
import entity.Page;

public interface OrderService {
	/**
	 * �鿴����ȫ����Ϣ
	 * @param name
	 * @param ment
	 * @param page
	 * @return
	 */
    public List<Order> query(String name,String ment,Page page);
	
    /**
     * ������ҳ��
     * @param name
     * @param ment
     * @return
     */
	public int count(String name,String ment);
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @param name
	 * @param ment
	 * @return
	 */
	public int count1(String name, String ment);
}
