package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

        // ここから    
    public static void test(int[] itemPrices) {
        int total = 0;
        int[] over2000 = new int[itemPrices.length];
        for (int itemPrice : itemPrices) {
            total += itemPrice;
        }
        for (int i = 0; i < itemPrices.length; i++) {
            if (itemPrices[i] >= 2000) {
                over2000[i] = itemPrices[i];
            }
        }
        String coupon = "";
        if (total < 5000) {
            coupon = "A";
        } else if (total >= 5000) {
            total /= 0.9;
            if (total < 5000) 
                coupon = "A";
            coupon = "B";
        } 
        for (int i = 0; i < over2000.length; i++) {
            if (over2000[i] >= 2000) {
                coupon = "C";
            }
        
        }
        System.out.println(coupon);
    }

        // ここまで
    
}
