package cn.edu.cqu.carwarsh.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 用户订单
 * 
 * @author liuji
 *
 */
@Entity
public class Order {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 与用户关联
	 */
	@ManyToOne(optional = false)
	// TODO 添加其他属性
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
