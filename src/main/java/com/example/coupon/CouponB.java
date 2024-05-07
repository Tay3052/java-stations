package com.example.coupon;

public class CouponB {
  public static float calculate(int[] cartItems) {
      // カート内の商品に対して10%割引
      float total = 0;
      for (int itemPrice : cartItems) {
          total += itemPrice;
      }
      total *= 0.9f;
      if (total < 5000) {
          total += 800; // 送料追加
      }
      return total;
  }
}