package entity;

import java.sql.Date;
/**
 * 瀹炰綋绫�
 * @author 閬ヤ笉鍙強
 *
 */
public class Order {
    public int id;//涓婚敭
    public String code;//璁㈠崟缂栧彿
    public String name;//鍟嗗搧鍚嶇О
    public String supplier;//渚涘簲鍟�
    public double money;//璁㈠崟閲戦
    public int isPayment;//鏄惁鏀粯
    public Date time;//鍒涘缓鏃堕棿
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
