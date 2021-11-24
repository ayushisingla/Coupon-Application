package com.ayushi.spring.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.spring.productservice.model.Coupon;
import com.ayushi.spring.productservice.model.Product;
import com.ayushi.spring.productservice.repos.ProductRepo;
import com.ayushi.spring.productservice.restclients.CouponClient;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@Autowired
	CouponClient couponclient;

	@Autowired
	ProductRepo repo;

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		Coupon coupon= couponclient.getCoupon(product.getCouponCode());
		System.out.println(coupon);
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
	}
	
	

}
