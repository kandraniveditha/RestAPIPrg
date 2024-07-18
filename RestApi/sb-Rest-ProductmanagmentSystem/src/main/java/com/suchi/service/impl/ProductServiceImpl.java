package com.suchi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.entity.ProductEntity;
import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Product;
import com.suchi.repo.ProductRepository;
import com.suchi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository daoImpl;
	
	
	@Override
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		//copy the data from product object to product entity object
		
		ProductEntity proEn=new ProductEntity();
		BeanUtils.copyProperties(p, proEn);
		ProductEntity pro=daoImpl.save(proEn);
		
		//entity object copy to product
		Product pr=new Product();
		BeanUtils.copyProperties(pro, pr);

		return pr;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<ProductEntity>productInfo=daoImpl.findAll();
		List<Product>addProducts=new ArrayList<Product>();
		for(ProductEntity proen:productInfo)
		{
			Product p=new Product();
			BeanUtils.copyProperties(proen, p);
			addProducts.add(p);
		}
		return addProducts;
	}

	@Override
	public Product findProductById(Long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Product updateProduct(Product p, long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		ProductEntity productEntity=daoImpl.findById(id).get();
		if(productEntity.getId()!=0) {
			//updating product information  copy into the product entity
			BeanUtils.copyProperties(p, productEntity);
		}
		else {
			throw new RecordNotFoundException("Given Record is Not Exists");
		}
		ProductEntity saveEnt=daoImpl.save(productEntity);
	Product pro=new Product();
	BeanUtils.copyProperties(saveEnt, pro);
		return p;
	}

	@Override
	public boolean deleteProduct(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}
 
	
}
