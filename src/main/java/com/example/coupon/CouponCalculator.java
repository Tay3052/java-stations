package com.example.coupon;

public class CouponCalculator {
  public static String findBestCoupon(int[] cartItems) {
      // クーポンAからCまでのどのクーポンを適用すると支払総額が一番低くなるかを計算
      float totalA = CouponA.calculate(cartItems);
      float totalB = CouponB.calculate(cartItems);
      float totalC = CouponC.calculate(cartItems);

      if (totalA <= totalB && totalA <= totalC) {
          return "A";
      } else if (totalB <= totalA && totalB <= totalC) {
          return "B";
      } else {
          return "C";
      }
  }
}
