package com.example.coupon;

import com.example.coupon.CouponCalculator;

public class Main {
    public static void main(String[] args) {
        int[] cartItems1 = {1000, 1100, 1200, 1300};
        int[] cartItems2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] cartItems3 = {1000, 2100, 3200, 2300};

        System.out.println("カート内: 1000円, 1100円, 1200円, 1300円。適用されるクーポン: " + CouponCalculator.findBestCoupon(cartItems1));
        System.out.println("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。適用されるクーポン: " + CouponCalculator.findBestCoupon(cartItems2));
        System.out.println("カート内: 1000円, 2100円, 3200円, 2300円。適用されるクーポン: " + CouponCalculator.findBestCoupon(cartItems3));
    }
}