package com.te.springmvc.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="items")
public class ItemsBean implements Serializable {
	@Id
	@Column
	private int userid;
	@Column
	private int quantity;
	@Column
	private int price;
	@Column
	private int review;
}
