package dao;

import java.util.List;
import java.util.Map;

import entity.Order;



public interface OrderDao {
	/**
	 * �鿴����ȫ����Ϣ
	 * @param map
	 * @return
	 */
		public List<Order> query(Map map);
		
		/**
		 * ������ҳ��
		 * @param map
		 * @return
		 */
		public int count(Map map);
		
		/**
		 * ��ѯ�ܼ�¼
		 * @param map
		 * @return
		 */
		public int count1(Map map);

}
