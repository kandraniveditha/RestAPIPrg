package com.suchi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="PRODUCT_NAME")

	private String productName;
	
	@Column(name="PRODUCT_PRICE")
	private String productPrice;
	
	@Column(name="PRODUCT_DESC")
	private String productdescription;
	
	@CreationTimestamp
	@Column(name="create_at",updatable=false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name="updated_at",insertable=false)
	
	private Date updatedAt;


}
