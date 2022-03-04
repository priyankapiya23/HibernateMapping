package com.map;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Item {

	@Id
	private int item_id;
	private String item_desc;
	public Item(int item_id, String item_desc, int item_price, List<Cart> c1) {
		super();
		this.item_id = item_id;
		this.item_desc = item_desc;
		this.item_price = item_price;
		this.c1 = c1;
	}
	public int getItem_id() {
		return item_id;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public List<Cart> getC1() {
		return c1;
	}
	public void setC1(List<Cart> c1) {
		this.c1 = c1;
	}
	private int item_price;
	@ManyToMany
	private List<Cart> c1;
	
}
