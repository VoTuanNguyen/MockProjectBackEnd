package com.fpt.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "src", columnDefinition = "text")
	private String src;
	@Column(name = "dest", columnDefinition = "text")
	private String dest;
	@Column(name = "price", columnDefinition = "double")
	private double price;

	public Route() {
		super();
	}

	public Route(int id, String src, String dest, double price) {
		super();
		this.id = id;
		this.src = src;
		this.dest = dest;
		this.price = price;
	}

	public Route(String src, String dest, double price) {
		super();
		this.src = src;
		this.dest = dest;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", src=" + src + ", dest=" + dest + ", price=" + price + "]";
	}

}
