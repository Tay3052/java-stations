package com.example.coupon;

public class CouponA {
  public static float calculate(int[] cartItems) {
      // 送料無料のため、支払総額は合計金額のまま
      float total = 0;
      for (int itemPrice : cartItems) {
          total += itemPrice;
      }
      return total;
  }
}