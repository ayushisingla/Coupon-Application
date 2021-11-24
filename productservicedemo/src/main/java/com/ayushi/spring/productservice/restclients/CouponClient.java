package com.ayushi.spring.productservice.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ayushi.spring.productservice.model.Coupon;

@FeignClient("COUPON-SERVICE")
public interface CouponClient {

	@GetMapping(value = "/couponapi/coupons/{code}")
	Coupon getCoupon(@PathVariable("code") String code);
}
