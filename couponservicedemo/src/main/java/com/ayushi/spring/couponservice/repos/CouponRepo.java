package com.ayushi.spring.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.spring.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
