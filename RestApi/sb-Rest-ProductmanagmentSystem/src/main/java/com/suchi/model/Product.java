package com.suchi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private long id;
	private String productName;
	private String productPrice;
	private String productDescription;
}
