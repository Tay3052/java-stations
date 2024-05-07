package com.example.coupon;

public class CouponC {
  public static float calculate(int[] cartItems) {
      // 2000円以上の商品を全て20%割引
      float total = 0;
      for (int itemPrice : cartItems) {
          if (itemPrice >= 2000) {
              total += itemPrice * 0.8;
          } else {
              total += itemPrice;
          }
      }
      if (total < 5000) {
          total += 800; // 送料追加
      }
      return total;
  }
}
