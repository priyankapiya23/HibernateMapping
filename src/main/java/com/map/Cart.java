package com.map;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Cart {
@Id 
private int cart_id;
private int cart_total;
@ManyToMany(mappedBy="c1")
private List<Item> i1;
public int getCart_id() {
	return cart_id;
}
public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}
public int getCart_total() {
	return cart_total;
}
public void setCart_total(int cart_total) {
	this.cart_total = cart_total;
}
public List<Item> getI1() {
	return i1;
}
public void setI1(List<Item> i1) {
	this.i1 = i1;
}
public Cart(int cart_id, int cart_total, List<Item> i1) {
	super();
	this.cart_id = cart_id;
	this.cart_total = cart_total;
	this.i1 = i1;
}
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}

}
