package dao;

import java.util.List;
import java.util.Map;

import entity.Order;



public interface OrderDao {
	/**
	 * 查看订单全部信息
	 * @param map
	 * @return
	 */
		public List<Order> query(Map map);
		
		/**
		 * 计算总页数
		 * @param map
		 * @return
		 */
		public int count(Map map);
		
		/**
		 * 查询总记录
		 * @param map
		 * @return
		 */
		public int count1(Map map);

}
